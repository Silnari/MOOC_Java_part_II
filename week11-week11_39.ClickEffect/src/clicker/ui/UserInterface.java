package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private PersonalCalculator calculator;

    public UserInterface(){
        calculator = new PersonalCalculator();
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(2,1);
        container.setLayout(layout);

        JLabel clicks = new JLabel("0");
        container.add(clicks);

        JButton counterButton = new JButton("Click!");
        ClickListener listener = new ClickListener(calculator,clicks);
        counterButton.addActionListener(listener);
        container.add(counterButton);
    }

    public JFrame getFrame() {
        return frame;
    }
}
