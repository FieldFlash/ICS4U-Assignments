package main;

public class OvalClass {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private boolean filled;
    private static int numOfOvals = 0;

    public static void main(String[] args) {
        int x1;
        int x2;
        int y1;
        int y2;
        boolean filled;

    }

    public OvalClass(int x1, int x2, int y1, int y2, boolean filled) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.filled = filled;
        numOfOvals++;
    }

    public OvalClass() {
        this(0, 0, 0, 0, false);
    }

    public int getX1() {
        return x1;
    }
    
    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public int getNumOfOvals() {
        return numOfOvals;
    }

    public int getUpperLeftX() {
        return Math.min(x1, x2);
    }
    
    public int getUpperLeftY() {
        return Math.min(y1, y2);
    }

    public int getWidth() {
        return Math.abs(x1 - x2);
    }

    public int getHeight() {
      `  return Math.abs(y1 - y2);
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