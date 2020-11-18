package OtherUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    JButton button;
    JButton button2;

    public ButtonPanel(){
        button = new JButton("Click Me!");
        button2 = new JButton("Don't click me!!!!");
        setLayout(new GridLayout(2,2));
        add(button);
        add(button2);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Thanks");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("You bitch");
            }
        });

    }
}
