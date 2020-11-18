package Shapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {
    protected ArrayList<Shape> shapes;

    public ShapeDB(){
        shapes = new ArrayList<>();
    }

    protected void addCircle(Point initPos, Color col, int rad){
        shapes.add(new Circle(initPos, col, rad));
    }

    protected void addRect(Point initPos, Color col, int h, int w){

        shapes.add(new Rect(initPos, col, h,w));
    }

    protected void addSquare(Point initPos, Color col, int s){

        shapes.add(new Square(initPos, col, s));
    }

    protected void drawer(Graphics g){
        for(Shape s : shapes){
            s.draw(g);
        }
    }

}
