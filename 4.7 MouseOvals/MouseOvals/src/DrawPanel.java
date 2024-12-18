import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    private JLabel statusBar; 
    private int freeIndex = 0;
    private Oval currentOval = null;
    private Oval[] ovals = new Oval[1000];
    private int initialX;
    private int initialY;
    
    public DrawPanel( JLabel statusLabel ) {
        statusBar = statusLabel;
        setBackground( Color.WHITE ); 
        
        MouseEventListener drawPanelListener = new MouseEventListener(); 
        addMouseListener( drawPanelListener ); 
        addMouseMotionListener( drawPanelListener );       
    } 
    
    class MouseEventListener extends MouseAdapter {
        // Mouse press indicates a new line has been started
        @Override
        public void mousePressed( MouseEvent event ) {
                initialY = event.getY();
                initialX = event.getX();
                currentOval = new Oval( event.getX(), event.getY(), event.getX(), event.getY(), Color.BLUE, false );
                repaint();
        }
        
        @Override
        public void mouseReleased( MouseEvent event ) {
            currentOval.setX2( event.getX() );
            currentOval.setY2( event.getY() );
            currentOval.setColor( Color.RED );
            
            if ( freeIndex < ovals.length ) {
                ovals[freeIndex] = currentOval;
                freeIndex++;
            }
            
            currentOval = null;
            repaint();            
        } 
        
        @Override
        public void mouseDragged( MouseEvent event ) {
            currentOval.setX2( event.getX() );
            currentOval.setY2( event.getY() );
            statusBar.setText( String.format( "Mouse at (%d, %d)", 
                                             event.getX(), event.getY() ) );
            repaint();
        } 
        
        // As mouse is moved, just update the statusBar
        @Override
        public void mouseMoved( MouseEvent event ) {
            statusBar.setText( String.format( "Mouse at (%d, %d)", 
                                             event.getX(), event.getY() ) );
        } 
    } 
    
    // This method is called automatically by the JVM when the window needs to be (re)drawn.
    @Override
    public void paintComponent( Graphics g ) {
        super.paintComponent( g );
        // Call the draw() method for each Line object in the array
        for ( int i = 0; i < freeIndex; i++ ) 
            ovals[i].draw( g );
        
        // If a line is in progress, draw it on top of all others
        if ( currentOval != null )
            currentOval.draw( g );
    } 
} 