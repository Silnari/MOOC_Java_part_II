package farmsimulator;

import java.util.Random;

public class Cow implements Milkable,Alive{
    private String name;
    private double udder;
    private double amount;

    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow(){
        this(NAMES[new Random().nextInt(30)]);
    }

    public Cow(String name){
        udder = 15 + new Random().nextInt(26);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public double getCapacity() {
        return udder;
    }

    @Override
    public String toString() {
        return name + " " + amount + "/" + Math.ceil(udder);
    }

    @Override
    public void liveHour() {
        double toAdd = Math.ceil( 0.7 + (2 - 0.7) * new Random().nextDouble());
        if(amount + toAdd > udder)
            amount = udder;
        else
            amount += toAdd;
    }

    @Override
    public double milk() {
        double milkTaken = amount;
        amount = 0;
        return milkTaken;
    }
}
