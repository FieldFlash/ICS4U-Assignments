import java.awt.Color;

public class FillableShape extends Shape {
    private boolean filled;

    public FillableShape(int x1, int y1, int x2, int y2, Color color, boolean filled) {
        super(x1, y1, x2, y2, color);
        this.filled = filled;
    }

    public boolean getFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public int getUpperLeftX(){
        return Math.min(x1, x2);
    }

    public int getUpperLeftY(){
        return Math.min(y1, y2);
    }

    public int getWidth(){
        return Math.abs(x1 - x2);
    }

    public int getHeight(){
        return Math.abs(y1 - y2);
    }
}
