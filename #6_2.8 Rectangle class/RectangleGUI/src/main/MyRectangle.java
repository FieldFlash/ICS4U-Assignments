package main;

import java.awt.Graphics;
import java.awt.Graphics2D; 

public class MyRectangle {
    private int x;
    private int y;
    private int x2;
    private int y2;
    private boolean filled;
    private static int rectCounter = 0;


    // Constructors
    public MyRectangle(int x, int y, int x2, int y2, boolean filled) {
        setX(x);
        setY(y);
        setx2(x2);
        sety2(y2);
        setFilled(filled);
        rectCounter++;
    }

    public MyRectangle() {
        this(0, 0, 0, 0, false);
    }


    // Setters
    public void setX(int x){
        if (x < 0){
            System.out.println("X cannot be negative");
            return;
        }
        this.x = x;
    }
    
    public void setY(int y){
        if (y < 0){
            System.out.println("Y cannot be negative");
            return;
        }
        this.y = y;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public void setx2(int x2){
        this.x2 = x2;
    }

    public void sety2(int y2){
        this.y2 = y2;
    }

   
   
   // Getters
    public int getX(){
        return x;
    }

    
    public int getY(){
        return y;
    }

    public boolean getFilled(){
        return filled;
    }

    public void getCoord(){
        System.out.printf("x: %d, y: %d\n", x, y);
        System.out.println("Filled: " + filled);
    }

    public int getx2(){
        return x2;
    }
    
    public int gety2(){
        return y2;
    }

    public static int getRectangles(){
        return rectCounter;
    }

    public int getUpperLeftX(){
        if (x < x2){
            return x;
        } else {
            return x2;
        }
    }

    public int getUpperLeftY(){
        if (y < y2){
            return y;
        } else {
            return y2;
        }
    }  

    public int getWidth(){
        return Math.abs(x - x2);
    }

    public int getHeight(){
        return Math.abs(y - y2);
    }

    public int getArea(){
        return getWidth() * getHeight();
    }
    
    // Draw method
    public void draw(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(this.getX(), this.getY(), this.getWidth(), this.getHeight()); // Example rectangle
    }
}
