package reference;

import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RatingRegister {
    private Map<Film,List<Rating>> ratings;
    private Map<Person,Map<Film,Rating>> personalRatings;

    public RatingRegister(){
        ratings = new HashMap<Film, List<Rating>>();
        personalRatings = new HashMap<Person,Map<Film,Rating>>();
    }

    public void addRating(Film film, Rating rating){
        if(!ratings.containsKey(film))
            ratings.put(film,new ArrayList<Rating>());

        ratings.get(film).add(rating);
    }

    public List<Rating> getRatings(Film film){
        return ratings.get(film);
    }

    public Map<Film, List<Rating>> filmRatings(){
        return ratings;
    }

    public void addRating(Person person, Film film, Rating rating){
        addRating(film,rating);
        if(!personalRatings.containsKey(person))
            personalRatings.put(person,new HashMap<Film,Rating>());

        personalRatings.get(person).put(film,rating);
    }

    public Rating getRating(Person person, Film film){
        if(!personalRatings.get(person).containsKey(film))
            return Rating.NOT_WATCHED;

        return personalRatings.get(person).get(film);
    }

    public Map<Film, Rating> getPersonalRatings(Person person){
        if(!personalRatings.containsKey(person))
            return new HashMap<Film, Rating>();

        return personalRatings.get(person);
    }

    public List<Person> reviewers(){
        List<Person> list = new ArrayList<Person>(personalRatings.keySet());
        return list;
    }
}
