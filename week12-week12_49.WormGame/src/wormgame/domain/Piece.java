package wormgame.domain;

public class Piece {
    private int x,y;


    public Piece(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean runsInto(Piece piece){
        if(piece.x == x && piece.y == y)
            return true;
        return false;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
