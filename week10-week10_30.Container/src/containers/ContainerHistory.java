package containers;

import java.util.ArrayList;
import java.util.Collections;

public class ContainerHistory {
    private ArrayList<Double> list;

    public ContainerHistory(){
        list = new ArrayList<Double>();
    }

    public void add(double situation){
        list.add(situation);
    }

    public void reset(){
        list.clear();
    }

    public double maxValue(){
        if(list.isEmpty())
            return 0;
        return Collections.max(list);
    }

    public double minValue(){
        if(list.isEmpty())
            return 0;
        return Collections.min(list);
    }

    private double sum(){
        double sum = 0;
        for(double x: list)
            sum += x;
        return sum;
    }

    public double average(){
        if(list.isEmpty())
            return 0;
        return sum()/list.size();
    }

    public double greatestFluctuation(){
        if(list.size() <= 1)
            return 0;

        double maxFluctuation = 0;
        for(int i = 0; i < list.size() - 1; i++){
            if(Math.abs(list.get(i) - list.get(i+1)) > maxFluctuation)
                maxFluctuation = Math.abs(list.get(i) - list.get(i+1));
        }
        return maxFluctuation;
    }

    public double variance(){
        if(list.size() <= 1)
            return 0;

        double variance = 0;
        for(double x : list)
            variance += Math.pow((x - average()),2);

        return variance/(list.size() - 1);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
