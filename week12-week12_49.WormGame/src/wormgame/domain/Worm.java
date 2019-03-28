package wormgame.domain;

import wormgame.Direction;

import java.util.ArrayList;
import java.util.List;

public class Worm {
    private List<Piece> pieces;
    private Direction direction;
    private boolean addOrNot = false;

    public Worm(int originalX, int originalY, Direction originalDirection){
        direction = originalDirection;
        pieces = new ArrayList<Piece>();
        pieces.add(new Piece(originalX,originalY));
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction dir) {
        this.direction = dir;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public int getLength(){
        return pieces.size();
    }

    public void move(){
        if(pieces.size() < 3){
            grow();
        }

        Piece newPiece = new Piece(pieces.get(pieces.size() - 1).getX(), pieces.get(pieces.size() - 1).getY());

        if(direction == Direction.UP){
            newPiece.move(0,-1);
        }
        if(direction == Direction.DOWN){
            newPiece.move(0,1);
        }
        if(direction == Direction.LEFT){
            newPiece.move(-1,0);
        }
        if(direction == Direction.RIGHT){
            newPiece.move(1,0);
        }

        pieces.add(newPiece);

        if(!addOrNot)
            pieces.remove(0);
        else{
            addOrNot = false;
        }
    }

    public void grow(){
        addOrNot = true;
    }

    public boolean runsInto(Piece piece){
        for (Piece p : pieces) {
            if(p.getY() == piece.getY() && p.getX() == piece.getX())
                return true;
        }
        return false;
    }

    public boolean runsIntoItself(){
        for (Piece piece : pieces) {
            for (Piece piece1 : pieces) {
                if (piece == piece1) {
                    continue;
                }
                if(piece.runsInto(piece1))
                    return true;
            }
        }
        return false;
    }
}
