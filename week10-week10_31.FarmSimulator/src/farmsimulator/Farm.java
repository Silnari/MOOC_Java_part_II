package farmsimulator;

import java.util.ArrayList;

public class Farm implements Alive{
    private String nameOfOwner;
    private Barn barn;
    private ArrayList<Cow> cows;

    public Farm(String name, Barn barn){
        this.nameOfOwner = name;
        this.barn = barn;
        cows = new ArrayList<Cow>();
    }

    public String getOwner() {
        return nameOfOwner;
    }

    public void addCow(Cow cow){
        cows.add(cow);
    }

    private String printCows() {
        if(cows.size() == 0)
            return "No cows.";
        String toReturn = "Animals:\n";
        for(Cow cow: cows)
            toReturn += "        " + cow.toString() + "\n";
        return toReturn;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot){
        barn.installMilkingRobot(milkingRobot);
    }

    public void manageCows(){
        barn.takeCareOf(cows);
    }

    @Override
    public String toString() {
        return "Farm owner: " + nameOfOwner + "\n" +
                "Barn bulk tank: " + barn.toString() + "\n" +
                printCows();
    }

    @Override
    public void liveHour() {
        for(Cow cow: cows)
            cow.liveHour();
    }
}
