package Shapes;

import java.awt.*;

public class Rect extends Shape {
    private int height;
    private int width;

    public Rect(Point initPos, Color col, int h, int w){
        super(initPos, col);
        height = h;
        width = w;
    }

    public void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x, pos.y, width, height);
    }

}
