package main;

public class MyOval extends FillableShape {
    
    /*
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private boolean filled;
    private static int numOfOvals = 0;
    */
    public static void main(String[] args) {
        private static int numOfOvals = 0;

    }

    public Oval(int x1, int x2, int y1, int y2, boolean filled) {
        super(x1, x2, y1, y2, filled);
        numOfOvals++;
    }

    public Oval() {
        this(0, 0, 0, 0, false);
    }

    public int getNumOfOvals() {
        return numOfOvals;
    }

    public double getArea() {
        return Math.PI * (getWidth() / 2.0) * (getHeight() / 2.0);
    }

    public boolean isCircle() {
        return getWidth() == getHeight();
    }

    public String toString() {
        return "Oval with upper left corner at (" + x1 + ", " + y1 + ") and lower right corner at (" + x2 + ", " + y2 + ")";
    }
}