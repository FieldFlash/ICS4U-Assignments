package main;
import OvalClass.java;
import MyRectangle.java;

public class App {
    public static void main(String[] args) throws Exception {
        MyRectangle rect = new Rectangle(100, 100, 200, 200, true);
        MyOval oval = new Oval(100, 500, 200, 200, true);
        rect.getArea();
        oval.getArea();
    }
}