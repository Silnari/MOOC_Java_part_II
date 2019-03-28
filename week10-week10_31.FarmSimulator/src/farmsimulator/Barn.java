package farmsimulator;

import java.util.Collection;

public class Barn {
    private BulkTank bulkTank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank bulkTank){
        this.bulkTank = bulkTank;
    }

    public BulkTank getBulkTank() {
        return bulkTank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkingRobot = milkingRobot;
        milkingRobot.setBulkTank(bulkTank);
    }

    public void takeCareOf(Cow cow){
        if(milkingRobot == null)
            throw new IllegalStateException();
        else
            milkingRobot.milk(cow);
    }

    public void takeCareOf(Collection<Cow> cows){
        if(milkingRobot == null)
            throw new IllegalStateException();
        else{
            for(Cow cow: cows)
                milkingRobot.milk(cow);
        }
    }

    @Override
    public String toString() {
        return bulkTank.toString();
    }
}
