package dungeon;

import java.util.Scanner;

public class Dungeon {
    private int moves;
    private Map map;
    private Scanner scanner;
    private boolean vampirMove;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        map = new Map(length,height,vampires);
        this.vampirMove = vampiresMove;
        this.moves = moves;
        scanner = new Scanner(System.in);
    }

    public void run(){
        map.map();

        map.printCoordinates(moves);
        map.drawMap();

        System.out.println();
        while(true) {
            String move = scanner.nextLine();

            map.setPlayer(move);
            moves--;

            if(vampirMove){
                for(int i = 0; i < move.length(); i++)
                    map.moveVampires();
            }

            map.checkStatus();
            if(map.isItWin()){
                System.out.println("YOU WIN");
                break;
            }

            map.map();
            map.printCoordinates(moves);
            map.drawMap();
            System.out.println();
            if(moves == 0)
                break;
        }
        if(!map.isItWin())
            System.out.println("YOU LOSE");
    }

}
