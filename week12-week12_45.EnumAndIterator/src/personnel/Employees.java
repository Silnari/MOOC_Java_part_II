package personnel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> employees;

    public Employees(){
        employees = new ArrayList<Person>();
    }

    public void add(Person person){
        employees.add(person);
    }

    public void add(List<Person> people){
        employees.addAll(people);
    }

    public void print(){
        Iterator<Person> iterator = employees.iterator();

        while(iterator.hasNext())
            System.out.println(iterator.next());
    }

    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()){
            Person nextPerson = iterator.next();

            if(nextPerson.getEducation() == education)
                System.out.println(nextPerson);
        }
    }

    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();
//        employees.removeIf(n -> (n.getEducation() == education));
        while (iterator.hasNext()){
            if(iterator.next().getEducation() == education)
                iterator.remove();
        }
    }
}
