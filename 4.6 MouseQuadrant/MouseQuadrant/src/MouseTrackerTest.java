import javax.swing.JFrame;

public class MouseTrackerTest {
    public static void main( String[] args ) { 
        JFrame appWindow = new JFrame();
        appWindow.add( new MyPanel() );
        appWindow.setSize( 300, 200 ); 
        appWindow.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        appWindow.setVisible( true ); 
    } 
} 