import java.util.ArrayList;

public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> toBeStoreds;

    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        toBeStoreds = new ArrayList<ToBeStored>();
    }

    public double weight(){
        double weight = 0;
        for(ToBeStored tmp: toBeStoreds)
            weight += tmp.weight();
        return weight;
    }

    public void add(ToBeStored toBeStored){
        if(weight() + toBeStored.weight() <= maxWeight)
            toBeStoreds.add(toBeStored);
    }

    @Override
    public String toString() {
        return "Box: " + toBeStoreds.size() + " things, total weight " + weight() + " kg";
    }
}
