package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things){
        List<Box> list = new ArrayList<Box>();
        list.add(new Box(boxesVolume));

        int i = 0;
        for(Thing thing: things){
            if(list.get(i).getVolume() + thing.getVolume() <= boxesVolume){
                list.get(i).addThing(thing);
                continue;
            }
            list.add(new Box(boxesVolume));
            i++;
            list.get(i).addThing(thing);
        }
        return list;
    }
}
