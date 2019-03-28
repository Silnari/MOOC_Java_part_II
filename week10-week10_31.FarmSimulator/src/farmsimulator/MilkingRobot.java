package farmsimulator;

public class MilkingRobot {
    private BulkTank bulkTank;

    public MilkingRobot(){ }

    public BulkTank getBulkTank() {
        return bulkTank;
    }

    public void setBulkTank(BulkTank bulkTank) {
        this.bulkTank = bulkTank;
    }

    public void milk(Milkable milkable){
        if(bulkTank == null)
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        else
            bulkTank.addToTank(milkable.milk());

    }
}
