import DrawingUI.DrawingUIController;
import OtherUI.ButtonPanel;
import OtherUI.MainMenu;

import javax.swing.*;
import java.awt.*;

public class SimpleUI {

    static GraphicsConfiguration gc;

    public static void main(String[] args){
        JFrame frame= new JFrame(gc); // Create a new JFrame
        frame.setSize(500,600);
        frame.add(new DrawingUIController().getMainPanel());
        frame.setVisible(true);
        // This next line closes the program when the frame is closed
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
