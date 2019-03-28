package reference;

import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.Film;
import reference.domain.Person;

import java.util.*;

public class Reference {
    private RatingRegister register;

    public Reference(RatingRegister register){
        this.register = register;
    }

    public Film recommendFilm(Person person){
        if(register.getPersonalRatings(person).isEmpty()){
            List<Film> films = new ArrayList<Film>(register.filmRatings().keySet());

            Collections.sort(films, new FilmComparator(register.filmRatings()));

            return films.get(0);
        }

        List<Person> people = register.reviewers();

        List<Film> personList = new ArrayList<Film>(register.getPersonalRatings(person).keySet());
        List<Film> toCompare;

        Map<Person,Integer> searchedMap = new HashMap<Person, Integer>();

        for(Person toCheck: people) {
            if (toCheck == person){
                searchedMap.put(toCheck,Integer.MIN_VALUE);
                continue;
            }

            toCompare = new ArrayList<Film>(register.getPersonalRatings(toCheck).keySet());

            toCompare.retainAll(personList);

            searchedMap.put(toCheck,similarity(person,toCheck,toCompare));
        }

        people.sort(new PersonComparator(searchedMap));

        for(Person p: people){
            toCompare = new ArrayList<Film>(register.getPersonalRatings(p).keySet());

            List<Film> toDelete = new ArrayList<Film>(toCompare);
            toDelete.retainAll(register.getPersonalRatings(person).keySet());

            toCompare.removeAll(toDelete);

            if(toCompare.isEmpty())
                continue;

            toCompare.sort(new FilmComparator(register.filmRatings()));
            if(register.getRating(p,toCompare.get(toCompare.size() - 1)).getValue() > 0)
                return toCompare.get(toCompare.size() - 1);
        }
        return null;
    }

    private int similarity(Person p1, Person p2, List<Film> films){
        int similarity = 0;

        for(Film film: films){
            similarity += register.getRating(p1,film).getValue() * register.getRating(p2,film).getValue();
        }

        return similarity;
    }
}
