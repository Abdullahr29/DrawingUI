package DrawingUI;

import javax.swing.*;
import java.awt.*;

public class CircleDimsSelector extends JPanel {
    JSlider slider;

    public CircleDimsSelector(){
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(3,1));
        JLabel label = new JLabel("Size");
        slider = new JSlider(1,100);
        controls.add(label);
        controls.add(slider);
        add(controls);
    }

    public int getCurrentRadius(){
        return slider.getValue();
    }
}
