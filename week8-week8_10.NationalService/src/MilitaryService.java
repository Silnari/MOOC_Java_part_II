public class MilitaryService implements NationalService{
    private int daysLeftOnService;

    public MilitaryService(int daysLeft){
        daysLeftOnService = daysLeft;
    }
    @Override
    public int getDaysLeft() {
        return daysLeftOnService;
    }

    @Override
    public void work() {
        if(daysLeftOnService > 0)
            daysLeftOnService--;
    }
}
