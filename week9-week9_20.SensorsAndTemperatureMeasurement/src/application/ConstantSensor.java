package application;

public class ConstantSensor implements Sensor{
    private int parameter;

    public ConstantSensor(int parameter){
        this.parameter = parameter;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public int measure() {
        if(!isOn())
            throw new IllegalStateException("Sensor is off!");
        return parameter;
    }

    @Override
    public void off() {
    }

    @Override
    public void on() {
    }

    @Override
    public boolean isConstant() {
        return true;
    }
}
