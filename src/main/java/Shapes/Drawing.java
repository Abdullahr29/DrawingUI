package Shapes;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Drawing extends Canvas {
    private Circle circle;
    private Rect rect;
    private Square square;
    private Frame f;
    ArrayList<Shape> shapes;
    ShapeDB shapeDB = new ShapeDB();

    // The constructor
    public Drawing(){
        setUpShapes();
        //setUpFrame();
        setUpCanvas();
    }

    private void setUpShapes() {
        shapes = shapeDB.shapes;
    }

    private void setUpCanvas() {
        setBackground(Color.CYAN); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    private void setUpFrame() {
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() { // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void paint(Graphics g){
        shapeDB.drawer(g);
    }

    public void addCircle(Point pos, Color col, int rad){
        shapeDB.addCircle(pos, col, rad);
    }
    public void addRect(Point pos, Color col, int h, int w){
        shapeDB.addRect(pos, col, h, w);
    }
    public void addSquare(Point pos, Color col, int s){
        shapeDB.addSquare(pos, col, s);
    }


}
