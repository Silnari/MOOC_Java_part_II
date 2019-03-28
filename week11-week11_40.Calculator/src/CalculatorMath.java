import javax.swing.*;

public class CalculatorMath {
    private JTextField input, output;

    public CalculatorMath(JTextField input, JTextField output) {
        this.input = input;
        this.output = output;
    }

    public int sum(int x, int y){
        return x+y;
    }

    public int minus(int x, int y){
        return x-y;
    }

    public int reset(){
        return 0;
    }
}
