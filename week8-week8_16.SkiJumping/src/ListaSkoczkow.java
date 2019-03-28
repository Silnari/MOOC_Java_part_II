import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ListaSkoczkow {
    private ArrayList<Skoczek> _skoczkowie;

    public ListaSkoczkow(){
        _skoczkowie = new ArrayList<Skoczek>();
    }

    public void add(String name){
        _skoczkowie.add(new Skoczek(name));
    }

    public void jump(){
        for(Skoczek skoczek: _skoczkowie) {
            Random random = new Random();
            ArrayList<Integer> judgesPoints = new ArrayList<Integer>();
            for (int i = 0; i < 5; i++) {
                judgesPoints.add(random.nextInt(11) + 10);
            }
            skoczek.set_judgesVotes(judgesPoints);
            Collections.sort(judgesPoints);
            int jump = random.nextInt(61) + 60;
            skoczek.set_mostRecentJumpLength(jump);
            int pointsToAdd = judgesPoints.get(1) + judgesPoints.get(2) + judgesPoints.get(3) + jump;
            skoczek.addJumpLength(jump);
            skoczek.add_points(pointsToAdd);
        }
    }

    public void printInOrder(){
        int i = 1;
        Collections.sort(_skoczkowie);
        Collections.reverse(_skoczkowie);
        while(i<=_skoczkowie.size()){
            System.out.println("  " + i + ". " + _skoczkowie.get(i - 1));
            i++;
        }
    }

    public void printPlayersResults(){
        int i = 0;
        while(i<_skoczkowie.size()){
            System.out.println("  " + _skoczkowie.get(i).get_name());

            System.out.println("    length: " + _skoczkowie.get(i).get_mostRecentJumpLength());

            System.out.println("    judge votes: " + _skoczkowie.get(i).get_judgesVotes());

            i++;
        }
    }

    public void printResults(){
        Collections.sort(_skoczkowie);
        System.out.print("Tournament results:\n" +
                "Position    Name\n");
        int i = 1;
        for(Skoczek skoczek: _skoczkowie){
            System.out.print(i + "           " + skoczek + " \n");
            System.out.print("            " );
            skoczek.printJumpLengths();
            i++;
        }
    }
}
