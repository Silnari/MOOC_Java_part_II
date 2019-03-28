package dungeon;

import java.util.ArrayList;
import java.util.Random;

public class Map {
    private int length;
    private int height;
    private ArrayList<Vampire> vampires;
    private int howManyVampires;
    private int playerX;
    private int playerY;
    private char[][] map;

    public Map(int length, int height, int vampires){
        this.length = length;
        this.height = height;
        this.playerX = 0;
        this.playerY = 0;
        this.howManyVampires = vampires;

        this.vampires = new ArrayList<Vampire>();
        addVampires(howManyVampires);

        map = new char[height][length + 1];
    }

    public int getHowManyVampires() {
        return howManyVampires;
    }

    public void map(){
        for(int i =0; i < height; i++){
            for(int j = 0; j <= length; j++){
                map[i][j] = '.';
            }
            map[i][height] = '\n';
        }
        map[this.playerY][this.playerX] = '@';

        int vampireX;
        int vampireY;

        for(int i = 0; i < howManyVampires; i++){
            vampireX = vampires.get(i).getX();
            vampireY = vampires.get(i).getY();

            map[vampireX][vampireY] = 'v';
        }
    }

    public void drawMap(){
        for(int i = 0; i < height; i++){
            for(int j = 0; j <= length; j++){
                System.out.print(map[i][j]);
            }
        }
    }

    public void printCoordinates(int moves){
        System.out.println(moves);
        System.out.println();

        System.out.println("@ " + (playerX) + " " + (playerY));

        for(Vampire vampire: vampires)
            System.out.println(vampire);

        System.out.println();
    }

    public void setPlayer(String move){
        for(int i = 0; i < move.length(); i++){
            switch(move.charAt(i)){
                case 'w':
                    if(playerY != 0)
                        playerY--;
                    break;
                case 'a':
                    if(playerX != 0)
                        playerX--;
                    break;

                case 's':
                    if(playerY != length - 1)
                        playerY++;
                    break;

                case 'd':
                    if(playerX != height - 1)
                        playerX++;
                    break;
            }
        }
    }

    private void addVampires(int number){
        if(number < 1)
            return;

        vampires.add(new Vampire(length,height));
        for(int i = 1; i < number; i++){
            Vampire toAdd = new Vampire(length,height);
            for(int j = 0; j < i; j++){
                if(vampires.get(j).isDifferentThanVampire(toAdd) && vampires.get(j).isDifferentThanPlayer(playerX,playerY))
                    continue;
                toAdd = new Vampire(length,height);
                j--;
            }
            vampires.add(toAdd);
        }
    }

    public boolean isItWin(){
        return howManyVampires == 0;
    }

    public void checkStatus(){
        ArrayList<Vampire> toRemove = new ArrayList<Vampire>();

        for(Vampire vampire: vampires) {
            if (!vampire.isDifferentThanPlayer(playerX, playerY)) {
                toRemove.add(vampire);
                howManyVampires--;
            }
        }

        vampires.removeAll(toRemove);
    }

    public void moveVampires(){
        Random whereToGo = new Random();
        for(Vampire vampire: vampires){
            int direction = whereToGo.nextInt(4);
            switch (direction){
                case 0:
                    //System.out.println("wampir " + vampire + "proboje ruszyc o 1 w dol");
                    vampire.moveXUp(length - 1);
                    break;
                case 1:
                    //System.out.println("wampir " + vampire + "proboje ruszyc o 1 w lewo");
                    vampire.moveXDown();
                    break;
                case 2:
                    //System.out.println("wampir " + vampire + "proboje ruszyc o 1 w gore");
                    vampire.moveYDown();
                    break;
                case 3:
                    //System.out.println("wampir " + vampire + "proboje ruszyc o 1 w prawo");
                    vampire.moveYUp(height - 1);
                    break;
            }
        }
    }
}
