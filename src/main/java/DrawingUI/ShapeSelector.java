package DrawingUI;

import javax.swing.*;
import java.awt.*;

public class ShapeSelector extends JPanel {
    JRadioButton bCircle = new JRadioButton("Circle");
    JRadioButton bRect = new JRadioButton("Rectangle");
    JRadioButton bSquare = new JRadioButton("Square");
    ButtonGroup bGroup = new ButtonGroup();

    public ShapeSelector(){
        bGroup.add(bCircle);
        bGroup.add(bRect);
        bGroup.add(bSquare);

        add(bCircle);
        add(bRect);
        add(bSquare);

        bCircle.setSelected(true);
    }

    protected int getCurrentShape(){
        if(bCircle.isSelected()){
           return 1;
        }
        else if(bRect.isSelected()){
            return 2;
        }
        else if(bSquare.isSelected()){
            return 3;
        }
        else{
            return 0;
        }
    }

}
