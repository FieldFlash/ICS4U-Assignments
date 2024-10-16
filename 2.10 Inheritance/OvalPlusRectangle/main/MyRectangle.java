package main;

import java.awt.Graphics;
import java.awt.Graphics2D; 

public class MyRectangle extends FillableShape {
    private static int rectCounter = 0;

    // Constructors
    public Rectangle(int x, int y, int x2, int y2, boolean filled) {
        super(x1, y1, x2, y2, filled);
        rectCounter++;
    }

    public Rectangle() {
        this(0, 0, 0, 0, false);
    }

    public static int getRectangles(){
        return rectCounter;
    }

    public int getArea(){
        return getWidth() * getHeight();
    }

    public boolean isOverlapping(MyRectangle other) {
        return this.getX() < other.getX() + other.getWidth() &&
               this.getX() + this.getWidth() > other.getX() &&
               this.getY() < other.getY() + other.getHeight() &&
               this.getY() + this.getHeight() > other.getY();
    }

    // Draw method
    public void draw(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(this.getX(), this.getY(), this.getWidth(), this.getHeight()); // Example rectangle
    }
}
