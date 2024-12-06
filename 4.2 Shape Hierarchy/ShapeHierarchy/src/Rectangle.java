import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends FillableShape {

    public Rectangle(int x1, int y1, int x2, int y2, Color color, boolean filled) {
        super(x1, y1, x2, y2, color, filled);

    }

    public void draw( Graphics g ) {
        g.setColor( color );
        if (super.getFilled()) {
            g.fillRect( x1, y1, x1, x1 );
        } else {
            g.drawRect( x1, y1, x2, y2 );
        }
    }
}
