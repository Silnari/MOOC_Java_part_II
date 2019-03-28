import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {
    private JTextField input, output;

    public MenuPanel(JTextField input, JTextField output){
        super(new GridLayout(1,3));
        this.input = input;
        this.output = output;
        createComponents();
    }

    private void createComponents(){
        JButton resetB = new JButton("Z");
        resetB.setEnabled(false);
        CalculatorListener calculator = new CalculatorListener(input,output,resetB);

        JButton addB = new JButton("+");
        addB.addActionListener(calculator);
        add(addB);

        JButton minusB = new JButton("-");
        minusB.addActionListener(calculator);
        add(minusB);

        resetB.addActionListener(calculator);
        add(resetB);
    }
}
