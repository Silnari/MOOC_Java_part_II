package boxes;

import java.util.ArrayList;

public class MaxWeightBox extends Box{
    private ArrayList<Thing> things;
    private int maxWeight;

    public MaxWeightBox(int maxWeight){
        things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }

    private int weight(){
        int weight = 0;
        for(Thing thing: things)
            weight += thing.getWeight();
        return weight;
    }

    @Override
    public void add(Thing thing) {
        if(thing.getWeight() + weight() <= maxWeight)
            things.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }
}
