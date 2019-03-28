import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> _things;
    private int _maxWeight;

    public Suitcase(int maxWeight){
        _maxWeight = maxWeight;
        _things = new ArrayList<Thing>();
    }

    public int totalWeight(){
        int totalWeight = 0;
        for(Thing thing: _things)
            totalWeight += thing.getWeight();
        return totalWeight;
    }

    public void addThing(Thing thing){
        if(totalWeight() + thing.getWeight() <= _maxWeight){
            _things.add(thing);
        }
    }

    public void printThings(){
        for(Thing thing: _things)
            System.out.println(thing);
    }

    public Thing heaviestThing(){
        if(_things.size() == 0)
            return null;
        Thing toReturn = new Thing("", 0);
        for(Thing thing: _things){
            if(toReturn.getWeight() < thing.getWeight())
                toReturn = thing;
        }
        return toReturn;
    }

    @Override
    public String toString() {
        if(_things.size() == 0)
            return "empty (0 kg)";
        if(_things.size() == 1)
            return "1 thing (" + totalWeight() + " kg)";
        return _things.size() + " things (" + totalWeight() + " kg)";
    }
}
