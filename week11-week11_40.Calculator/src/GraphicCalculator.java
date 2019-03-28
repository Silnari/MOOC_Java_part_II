
import java.awt.*;
import javax.swing.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400,200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);

        JTextField output = new JTextField();
        output.setEnabled(false);

        JTextField input = new JTextField("0");

        container.add(output);
        container.add(input);

        container.add(new MenuPanel(input,output), BorderLayout.SOUTH);
    }


    public JFrame getFrame() {
        return frame;
    }
}
