import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorListener implements ActionListener {
    private CalculatorMath calculator;
    private JTextField input;
    private JTextField output;
    private JButton reset;

    public CalculatorListener(JTextField input, JTextField output, JButton reset){
        this.reset = reset;
        this.input = input;
        this.output = output;
        calculator = new CalculatorMath(this.input,this.output);
        output.setText("0");
    }

    public CalculatorListener(JTextField input, JTextField output){
        this(input,output,null);
    }

    private boolean isNumeric(String toCheck){
        try{
            int num = Integer.parseInt(toCheck);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String txt = "";
        if(e.getActionCommand().equals("+")){
            if(isNumeric(input.getText())) {
                int n1 = Integer.parseInt(output.getText());
                int n2 = Integer.parseInt(input.getText());

                output.setText(txt + calculator.sum(n1, n2));
            }
        }

        if(e.getActionCommand().equals("-")){
            if(isNumeric(input.getText())) {
                int n1 = Integer.parseInt(output.getText());
                int n2 = Integer.parseInt(input.getText());

                output.setText(txt + calculator.minus(n1, n2));
            }
        }

        if(e.getActionCommand().equals("Z")){
            output.setText(txt + calculator.reset());
        }

        input.setText("");

        if(reset != null){
            if(output.getText().equals("0"))
                reset.setEnabled(false);
            else
                reset.setEnabled(true);
        }
    }
}
