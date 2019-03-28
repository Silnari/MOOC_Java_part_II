import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> _note;

    public  PromissoryNote(){
        _note = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value){
        _note.put(toWhom,value);
    }

    public double howMuchIsTheDebt(String whose){
        if(_note.containsKey(whose))
            return _note.get(whose);
        return 0;
    }
}
