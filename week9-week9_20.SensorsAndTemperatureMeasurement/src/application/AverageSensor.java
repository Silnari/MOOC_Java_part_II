package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor(){
        sensors = new ArrayList<Sensor>();
        readings = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional){
        sensors.add(additional);
    }

    public List<Integer> readings(){
        return readings;
    }

    @Override
    public boolean isOn() {
        boolean isOn = true;
        for(Sensor sensor: sensors){
            if(!sensor.isOn())
                isOn = false;
        }
        return isOn;
    }

    @Override
    public void on() {
        for(Sensor sensor: sensors){
            sensor.on();
        }
    }

    @Override
    public void off() {
        for(Sensor sensor: sensors){
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if(!isOn())
            throw new IllegalStateException("sensor is off");

        int measure = 0;
        for(Sensor sensor: sensors)
            measure += sensor.measure();
        readings.add(measure/sensors.size());
        return measure/sensors.size();
    }

    @Override
    public boolean isConstant() {
        return false;
    }
}
