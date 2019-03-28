public class Plane {
    private String _name;
    private int _capacity;

    public Plane(String name, int capacity){
        _name = name;
        _capacity = capacity;
    }

    @Override
    public String toString() {
        return _name + " (" + _capacity + " ppl)";
    }
}