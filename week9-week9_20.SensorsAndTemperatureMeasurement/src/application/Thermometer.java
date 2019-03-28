package application;

import java.util.Random;

public class Thermometer implements Sensor{
    private boolean isOn;

    public Thermometer(){
        isOn = false;
    }

    @Override
    public void on() {
        isOn = true;
    }

    @Override
    public void off() {
        isOn = false;
    }

    @Override
    public int measure() {
        if(!isOn)
            throw new IllegalStateException("sensor is off!");
        Random random = new Random();
        return random.nextInt(61) - 30;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public boolean isConstant() {
        return false;
    }
}
