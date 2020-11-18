package DrawingUI;

import javax.swing.*;
import java.awt.*;

public class ShapeCounter extends JPanel {
    int numRect = 0, numCirc = 0, numSq = 0;
    JLabel label1;
    JLabel label2;
    JLabel label3;

    public ShapeCounter(){
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(4,1));
        label1 = new JLabel("Rects: " + numRect);
        label2 = new JLabel("Circles: " + numCirc);
        label3 = new JLabel("Squares: " + numSq);
        controls.add(label1);
        controls.add(label2);
        controls.add(label3);
        add(controls);
    }

    public void reprint(){
        label1.setText("Rects: " + numRect);
        label2.setText("Circles: " + numCirc);
        label3.setText("Squares: " + numSq);
    }

}
