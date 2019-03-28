package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing{
    private int maximumCapacity;
    private List<Thing> things;

    public Box(int maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        things = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing){
        if(thing.getVolume() + getVolume() <= maximumCapacity){
            things.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        if(things.isEmpty())
            return 0;

        int volume = 0;
        for(Thing thing: things)
            volume += thing.getVolume();
        return volume;
    }
}
