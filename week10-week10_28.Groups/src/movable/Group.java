package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable> list;

    public Group(){
        list = new ArrayList<Movable>();
    }

    public void addToGroup(Movable movable){
        list.add(movable);
    }

    @Override
    public String toString() {
        String toReturn = "";
        for(Movable movable: list)
            toReturn += movable.toString() + "\n";
        return toReturn;
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable movable: list)
            movable.move(dx,dy);
    }
}
