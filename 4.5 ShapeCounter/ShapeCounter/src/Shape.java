import java.awt.Color;
import java.awt.Graphics;

public class Shape {
    public int x1;
    public int y1;
    public int x2;
    public int y2;
    public Color color;

    public Shape(int x1, int y1, int x2, int y2, Color color){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    public int getX1(){
        return x1;
    }

    public int getY1(){
        return y1;
    }

    public int getX2(){
        return x2;
    }

    public int getY2(){
        return y2;
    }

    public Color getColor(){
        return color;
    }

    // Setters

    public void setX1(int x1){
        this.x1 = x1;
    }

    public void setY1(int y1){
        this.y1 = y1;
    }

    public void setX2(int x2){
        this.x2 = x2;
    }

    public void setY2(int y2){
        this.y2 = y2;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public void draw( Graphics g ){
        // This method will be overridden by subclasses
    }

    public String toString(Shape rect, Shape oval, Shape line){ 
        return "Rectangles: " + rect + "Ovals: " + oval + "Lines: " + line; 
    }
}
