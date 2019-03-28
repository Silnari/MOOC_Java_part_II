package reader.criteria;

public class Both implements Criterion {
    private Criterion criterion1, criterion2;

    public Both(Criterion criterion1, Criterion criterion2){
        this.criterion1 = criterion1;
        this.criterion2 = criterion2;
    }

    @Override
    public boolean complies(String line) {
        if(criterion2.complies(line) && criterion1.complies(line))
            return true;
        return false;
    }
}
