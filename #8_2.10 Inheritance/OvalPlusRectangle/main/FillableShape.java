package main;

public class FillableShape {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private boolean filled;

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

    public void setX2(int x2){
        this.x2 = x2;
    }

    public void setY2(int y2){
        this.y2 = y2;
    }
   
   // Getters
    public int getX1(){
        return x;
    }
    
    public int getY1(){
        return y;
    }

    public int getX2(){
        return x2;
    }
    
    public int getY2(){
        return y2;
    }

    public boolean getFilled(){
        return filled;
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

}