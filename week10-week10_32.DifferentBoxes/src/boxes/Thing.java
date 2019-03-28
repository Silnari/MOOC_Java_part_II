package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if(weight < 0)
            throw new IllegalArgumentException();
        else {
            this.name = name;
            this.weight = weight;
        }
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;

        if(obj.getClass()!= getClass())
            return false;

        Thing toCompare = (Thing)obj;

        if(!name.equals(toCompare.name))
            return false;

        return true;
    }
}
