public class CivilService implements NationalService {
    private int daysLeftOnService;

    public CivilService(){ daysLeftOnService = 362; }

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
