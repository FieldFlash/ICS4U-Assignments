import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class MyPanel extends JPanel {
    
    public MyPanel() {
        addMouseMotionListener( new MouseMotionListener() {
            @Override
            public void mouseDragged( MouseEvent event ) {
                System.out.println( "Mouse dragged" );
            }

            @Override
            public void mouseMoved( MouseEvent event ) {
                if(event.getX() > (getWidth() / 2) && event.getY() > (getHeight() / 2)) {
                    System.out.println( "Q4" );
                    setBackground( java.awt.Color.RED );
                }
                else if(event.getX() < (getWidth() / 2) && event.getY() > (getHeight() / 2)) {
                    System.out.println( "Q3" );
                    setBackground( java.awt.Color.BLUE );
                }
                else if(event.getX() < (getWidth() / 2) && event.getY() < (getHeight() / 2)) {
                    System.out.println( "Q2" );
                    setBackground( java.awt.Color.GREEN );
                }
                else if(event.getX() > (getWidth() / 2) && event.getY() < (getHeight() / 2)) {
                    System.out.println( "Q1" );
                    setBackground( java.awt.Color.YELLOW );
                }
            }
        });

    }
}