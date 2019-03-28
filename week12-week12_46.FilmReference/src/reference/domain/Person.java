package reference.domain;

public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;

        if(obj.getClass() != getClass())
            return false;

        Person toCompare = (Person) obj;

        if(!name.equals(toCompare.name))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        if(name == null)
            return 0;
        return name.hashCode();
    }
}
