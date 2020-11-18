package DrawingUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColourSelector extends JPanel {
    Color currentColour;
    JButton b1 = new JButton("Choose Colour");

    public ColourSelector(){
        currentColour = Color.BLACK;
        add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Color newColour = JColorChooser.showDialog(
                        b1, "Choose Colour", currentColour);
                currentColour = newColour;
                b1.setBackground(currentColour);
            }
        });
    }

    public Color getCurrentColour(){
        return currentColour;
    }
}
