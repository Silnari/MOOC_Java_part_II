public class Calculator {
    private Reader reader;
    private int _numberOfCalculations;

    public Calculator(){
        reader = new Reader();
        _numberOfCalculations = 0;
    }

    private void sum(){
        System.out.print("value1: ");
        int n1 = reader.readInteger();
        System.out.print("value2: ");
        int n2 = reader.readInteger();
        _numberOfCalculations++;
        System.out.println("sum of the values " + (n1+n2));
    }

    private void difference(){
        System.out.print("value1: ");
        int n1 = reader.readInteger();
        System.out.print("value2: ");
        int n2 = reader.readInteger();
        _numberOfCalculations++;
        System.out.println("difference of the values " + (n1-n2));
    }

    private void product(){
        System.out.print("value1: ");
        int n1 = reader.readInteger();
        System.out.print("value2: ");
        int n2 = reader.readInteger();
        _numberOfCalculations++;
        System.out.println("product of the values " + (n1*n2));
    }

    private void statistics(){
        System.out.println("Calculations done " + _numberOfCalculations);
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
        statistics();
    }
}
