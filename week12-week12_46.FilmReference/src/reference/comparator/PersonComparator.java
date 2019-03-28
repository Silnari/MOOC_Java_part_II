package reference.comparator;

import reference.domain.Person;

import java.util.Comparator;
import java.util.Map;

public class PersonComparator implements Comparator<Person> {
    private Map<Person, Integer> map;

    public PersonComparator(Map<Person, Integer> peopleIdentities){
        map = peopleIdentities;
    }

    @Override
    public int compare(Person p1, Person p2) {
        return map.get(p2) - map.get(p1);
    }
}
