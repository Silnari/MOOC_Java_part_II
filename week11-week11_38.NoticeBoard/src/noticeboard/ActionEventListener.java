package noticeboard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventListener implements ActionListener {
    private JTextField origin;
    private JLabel destination;

    public ActionEventListener(JTextField origin, JLabel destination){
        this.destination = destination;
        this.origin = origin;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        destination.setText(origin.getText());
        origin.setText("");
    }
}
