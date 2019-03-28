public class Thing {
    private String _name;
    private int _weight;

    public Thing(String name, int weight){
        _name = name;
        _weight = weight;
    }

    public String getName() {
        return _name;
    }

    public int getWeight() {
        return _weight;
    }

    @Override
    public String toString() {
        return _name + " (" + _weight + " kg)";
    }
}
