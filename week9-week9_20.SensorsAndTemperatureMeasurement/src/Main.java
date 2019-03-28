import application.AverageSensor;
import application.ConstantSensor;
import application.Sensor;
import application.Thermometer;

public class Main {
    public static void main(String[] args) {
        AverageSensor ka = new AverageSensor();
        ka.addSensor(new ConstantSensor(3));
        ka.addSensor(new ConstantSensor(7));
        System.out.println(ka.readings());
    }

}
