import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JButtonFrame extends JFrame {
    // These JButton references are declared as instance variables (rather than
    // local variables) so that they can be directly accessed by the inner class.
    private final JButton imageButton1;
    private final JButton imageButton2;
    private int totalStudents = 0;
    private int studentsPassed = 0;
    private final JLabel textField;
    String filePath1 = "/Users/liamshelston/Desktop/DesktopLiam/ICS4U-Work/ICS4U-Assignments/4.3 Labels and Buttons/LabelsAndButtons/src/res/checkmark.png";
    String filePath2 = "/Users/liamshelston/Desktop/DesktopLiam/ICS4U-Work/ICS4U-Assignments/4.3 Labels and Buttons/LabelsAndButtons/src/res/xmark.png";

    public JButtonFrame() {
        super( "JButton Demo" );

        ButtonEventListener eventListener = new ButtonEventListener();


        // Call the parent JFrame constructor to set the title, and switch to FlowLayout
        setLayout( new FlowLayout() );
        
        // Followed by a JButton with an image on it
        ImageIcon checkMark = new ImageIcon(filePath1);
        imageButton1 = new JButton( checkMark );
        imageButton1.setToolTipText( "Click to add a passing student" );
        // Create an instance of ButtonEventListener
        // Use the same ButtonEventListener object for this button too
        imageButton1.addActionListener( eventListener );
        add( imageButton1 );  


        textField = new JLabel("Out of " + totalStudents + " students, " + studentsPassed + " passed");
        textField.setText("Out of " + totalStudents + " students, " + studentsPassed + " passed");
        add(textField);


        ImageIcon xMark = new ImageIcon(filePath2);
        imageButton2 = new JButton( xMark );
        imageButton2.setToolTipText( "Click to add a failing student" );
        imageButton2.addActionListener( eventListener );
        add( imageButton2 );
        
    }  
    
    // Here is the inner class for event handling
    class ButtonEventListener implements ActionListener {
        // The ActionListener interface requires that we override the actionPerformed() method.
        // This method will be called automatically whenever a button event occurs.
        @Override 
        public void actionPerformed( ActionEvent e ) {
            // The ActionEvent getSource() method returns a reference to the button widget that was clicked
            // This allows us to use one event listener for more than one JButton, if desired.
            if ( e.getSource() == imageButton1 ) {
                totalStudents++;
                studentsPassed++;
                textField.setText("Out of " + totalStudents + " students, " + studentsPassed + " passed");
                repaint();
            }
            else if ( e.getSource() == imageButton2 ) {
                totalStudents++;
                textField.setText("Out of " + totalStudents + " students, " + studentsPassed + " passed");
                repaint();
            }
        }
    }
}