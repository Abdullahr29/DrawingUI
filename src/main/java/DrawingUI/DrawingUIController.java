package DrawingUI;

import Shapes.Drawing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingUIController {
    Drawing drawing = new Drawing();
    JPanel controlsPanel = new JPanel();
    JPanel mainPanel = new JPanel();
    ShapeSelector shapeSel = new ShapeSelector();
    ColourSelector colSel = new ColourSelector();
    CircleDimsSelector dimSel = new CircleDimsSelector();
    ShapeCounter counter = new ShapeCounter();

    public DrawingUIController(){
        controlsPanel.setLayout(new GridLayout(4,1));
        mainPanel.setLayout(new GridLayout(2,1));

        mainPanel.add(controlsPanel);
        mainPanel.add(drawing);

        controlsPanel.add(shapeSel);
        controlsPanel.add(colSel);
        controlsPanel.add(dimSel);
        controlsPanel.add(counter);


        drawing.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                if(shapeSel.getCurrentShape() == 1) {
                    drawing.addCircle(mouseEvent.getPoint(), colSel.getCurrentColour(), dimSel.getCurrentRadius());
                    counter.numCirc++;
                }
                else if(shapeSel.getCurrentShape() == 2){
                    drawing.addRect(mouseEvent.getPoint(), colSel.getCurrentColour(), dimSel.getCurrentRadius()/2, dimSel.getCurrentRadius());
                    counter.numRect++;
                }
                else if(shapeSel.getCurrentShape() == 3){
                    drawing.addSquare(mouseEvent.getPoint(), colSel.getCurrentColour(), dimSel.getCurrentRadius());
                    counter.numSq++;
                }
                drawing.repaint();
                counter.reprint();
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

    }

    public JPanel getMainPanel(){
        return mainPanel;
    }


}
