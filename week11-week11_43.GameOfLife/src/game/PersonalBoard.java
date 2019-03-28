package game;

import gameoflife.GameOfLifeBoard;

import java.util.Random;

public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height){
        super(width,height);
    }

    @Override
    public void initiateRandomCells(double v) {
        Random random = new Random();
        for(int i = 0; i < getHeight(); i++){
            for(int j = 0; j < getWidth(); j++){
                if(random.nextDouble() <= v)
                    getBoard()[j][i] = true;
                else
                    getBoard()[j][i] = false;
            }
        }
    }

    @Override
    public boolean isAlive(int i, int i1) {
        if ((i < getWidth() && i1 < getHeight()) && (i >= 0 && i1 >= 0)) {
            return getBoard()[i][i1];
        }
        return false;
    }

    @Override
    public void turnToLiving(int i, int i1) {
        if ((i < getWidth() && i1 < getHeight()) && (i >= 0 && i1 >= 0)) {
            getBoard()[i][i1] = true;
        }
    }

    @Override
    public void turnToDead(int i, int i1) {
        if ((i < getWidth() && i1 < getHeight()) && (i >= 0 && i1 >= 0)) {
            getBoard()[i][i1] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        int livingNeighbours = 0;

        if(i == 0 && i1 == 0){
            if(getBoard()[1][0])
                livingNeighbours++;
            if(getBoard()[1][1])
                livingNeighbours++;
            if(getBoard()[0][1])
                livingNeighbours++;
        }
        if(i == 0 && i1 == getHeight() - 1){
            if(getBoard()[1][getHeight() - 2])
                livingNeighbours++;
            if(getBoard()[1][getHeight() - 1])
                livingNeighbours++;
            if(getBoard()[0][getHeight() - 2])
                livingNeighbours++;
        }
        if(i == getWidth() - 1 && i1 == 0){
            if(getBoard()[getWidth() - 2][0])
                livingNeighbours++;
            if(getBoard()[getWidth() - 1][0])
                livingNeighbours++;
            if(getBoard()[getWidth() - 2][0])
                livingNeighbours++;
        }
        if(i == getWidth() - 1 && i1 == getHeight() - 1){
            if(getBoard()[getWidth() - 2][getHeight() - 2])
                livingNeighbours++;
            if(getBoard()[getWidth() - 1][getHeight() - 2])
                livingNeighbours++;
            if(getBoard()[getWidth() - 2][getHeight() - 1])
                livingNeighbours++;
        }

        if(i == 0 && (i1 != 0 && i1 != getHeight() - 1)){
            if(getBoard()[0][i1 - 1])
                livingNeighbours++;
            if(getBoard()[0][i1 + 1])
                livingNeighbours++;
            if(getBoard()[1][i1 - 1])
                livingNeighbours++;
            if(getBoard()[1][i1 + 1])
                livingNeighbours++;
            if(getBoard()[1][i1])
                livingNeighbours++;
        }
        if(i == getWidth() - 1 && (i1 != 0 && i1 != getHeight() - 1)){
            if(getBoard()[i][i1 - 1])
                livingNeighbours++;
            if(getBoard()[i][i1 + 1])
                livingNeighbours++;
            if(getBoard()[i-1][i1 - 1])
                livingNeighbours++;
            if(getBoard()[i-1][i1 + 1])
                livingNeighbours++;
            if(getBoard()[i-1][i1])
                livingNeighbours++;
        }
        if(i1 == 0 && (i != 0 && i != getWidth() - 1)){
            if(getBoard()[i + 1][0])
                livingNeighbours++;
            if(getBoard()[i - 1][0])
                livingNeighbours++;
            if(getBoard()[i - 1][1])
                livingNeighbours++;
            if(getBoard()[i + 1][1])
                livingNeighbours++;
            if(getBoard()[i][1])
                livingNeighbours++;
        }
        if(i1 == getHeight() - 1 && (i != 0 && i != getWidth() - 1)){
            if(getBoard()[i + 1][i1])
                livingNeighbours++;
            if(getBoard()[i - 1][i1])
                livingNeighbours++;
            if(getBoard()[i - 1][i1 - 1])
                livingNeighbours++;
            if(getBoard()[i + 1][i1 - 1])
                livingNeighbours++;
            if(getBoard()[i][i1 - 1])
                livingNeighbours++;
        }

        if (i != 0 && i != getWidth() - 1 && i1 != 0 && i1 != getHeight() - 1) {
            if(getBoard()[i - 1][i1 - 1])
                livingNeighbours++;
            if(getBoard()[i - 1][i1])
                livingNeighbours++;
            if(getBoard()[i - 1][i1 + 1])
                livingNeighbours++;
            if(getBoard()[i][i1 - 1])
                livingNeighbours++;
            if(getBoard()[i][i1 + 1])
                livingNeighbours++;
            if(getBoard()[i + 1][i1 - 1])
                livingNeighbours++;
            if(getBoard()[i + 1][i1])
                livingNeighbours++;
            if(getBoard()[i + 1][i1 + 1])
                livingNeighbours++;
        }
        return livingNeighbours;
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        if(i2 < 2 || i2 > 3){
            if(isAlive(i,i1))
                turnToDead(i,i1);
        }

        if(i2 == 3 && !isAlive(i,i1))
            turnToLiving(i,i1);
    }
}
