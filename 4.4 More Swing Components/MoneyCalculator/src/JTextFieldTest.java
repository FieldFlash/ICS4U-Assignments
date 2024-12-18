import javax.swing.JFrame;

public class JTextFieldTest {
    public static void main( String[] args ) {
        JTextFieldFrame appWindow = new JTextFieldFrame();
         
        appWindow.setSize( 500, 300 );
        appWindow.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        appWindow.setVisible( true );
    }    
}