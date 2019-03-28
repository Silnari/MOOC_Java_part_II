package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200,300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container){
        BoxLayout layout = new BoxLayout(container,BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Are you?"));

        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");

        ButtonGroup buttonGroup = new ButtonGroup();

        buttonGroup.add(yes);
        buttonGroup.add(no);

        container.add(yes);
        container.add(no);

        container.add(new JLabel("Why?"));

        JRadioButton nor = new JRadioButton("No reason.");
        JRadioButton cos = new JRadioButton("Because it is fun!");

        ButtonGroup buttonGroup1 = new ButtonGroup();

        buttonGroup1.add(nor);
        buttonGroup1.add(cos);

        container.add(nor);
        container.add(cos);

        container.add(new JButton("Done!"));
    }

    public JFrame getFrame() {
        return frame;
    }
}
