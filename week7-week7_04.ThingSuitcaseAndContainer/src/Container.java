import java.util.ArrayList;

public class Container {
    private int _maximumWeightLimit;
    private ArrayList<Suitcase> _container;

    public Container(int maximumWeightLimit){
        _maximumWeightLimit = maximumWeightLimit;
        _container = new ArrayList<Suitcase>();
    }

    private int totalContainerWeight(){
        int totalWeight = 0;
        for(Suitcase suitcase: _container)
            totalWeight += suitcase.totalWeight();
        return totalWeight;
    }

    public void addSuitcase(Suitcase suitcase){
        if(totalContainerWeight() + suitcase.totalWeight() <= _maximumWeightLimit){
            _container.add(suitcase);
        }
    }

    public void printThings(){
        for(Suitcase suitcase: _container)
            suitcase.printThings();
    }

    @Override
    public String toString() {
        if(_container.size() == 0)
            return "empty (0 kg)";
        if(_container.size() == 1)
            return "1 suitcase (" + totalContainerWeight() + " kg)";
        return _container.size() + " suitcases (" + totalContainerWeight() + " kg)";
    }
}
