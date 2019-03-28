public class Student implements Comparable<Student>{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareToIgnoreCase(o.getName());
    }

    @Override
    public String toString() {
        return name;
    }

}
