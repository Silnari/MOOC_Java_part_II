package dungeon;

import java.util.Random;

public class Vampire {
    private int x;
    private int y;

    public Vampire(int maxX, int maxY){
        randomize(maxX,maxY);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveXUp(int maxX){
        if(this.x + 1 < maxX)
            this.x += 1;
    }

    public void moveYUp(int maxY){
        if(this.y + 1 < maxY)
            this.y += 1;
    }

    public void moveXDown(){
        if(this.x - 1 > 0)
            this.x -= 1;
    }

    public void moveYDown(){
        if(this.x - 1 > 0)
            this.x -= 1;
    }

    public void randomize(int maxX, int maxY){
        Random r = new Random();
        x = r.nextInt(maxX);
        y = r.nextInt(maxY);
    }

    public boolean isDifferentThanPlayer(int x, int y){
        if(this.x == y && this.y == x)
            return false;
        return true;
    }

    public boolean isDifferentThanVampire(Vampire vampire){
        if(this.x == vampire.x && this.y == vampire.y)
            return false;
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;

        if(obj.getClass() != getClass())
            return false;

        Vampire toCompare = (Vampire) obj;

        if(this.x != toCompare.x)
            return false;

        if(this.y != toCompare.y)
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "v " + (y) + " " + (x);
    }
}
