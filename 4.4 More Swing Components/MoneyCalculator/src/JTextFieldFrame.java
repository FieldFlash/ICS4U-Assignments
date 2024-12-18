import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JTextFieldFrame extends JFrame {
    // This JTextField reference will be accessed by the inner class.
    private final JTextField inputField;
    private final JTextField toonies;
    private final JTextField loonies;
    private final JTextField quarters;
    private final JTextField dimes;
    private final JTextField nickels;
    private final JTextField pennies;
    
    public JTextFieldFrame() {
        super( "JTextField Demo" );
        setLayout( new FlowLayout() );
        
        // Create and add a JLabel to our JFrame in one step
        add( new JLabel( "Money Calculator" ) );
        
        // Create a JTextField with default text in it, and roughly 10 characters width
        inputField = new JTextField( "Enter total money (decimal value)" );
        inputField.setColumns(20);

        // Create a TextFieldEventListener object
        ActionListener inputFieldListener = new TextFieldEventListener();
        // And associate it with the JTextField
        inputField.addActionListener( inputFieldListener );
        add( inputField );          


                
        toonies = new JTextField();
        toonies.setEditable(false);
        toonies.setColumns(20);
        toonies.setText("Toonies: ");

        loonies = new JTextField();
        loonies.setEditable(false);
        loonies.setColumns(20);
        loonies.setText("Loonies: ");

        quarters = new JTextField();
        quarters.setEditable(false);
        quarters.setColumns(20);
        quarters.setText("Quarters: ");

        dimes = new JTextField();
        dimes.setEditable(false);
        dimes.setColumns(20);
        dimes.setText("Dimes: ");

        nickels = new JTextField();
        nickels.setEditable(false);
        nickels.setColumns(20);
        nickels.setText("Nickels: ");

        pennies = new JTextField();
        pennies.setEditable(false);
        pennies.setColumns(20);
        pennies.setText("Pennies: ");
        
        add( toonies );
        add( loonies );
        add( quarters );
        add( dimes );
        add( nickels );
        add( pennies );
    

    }
    
    // Here is the inner class for event handling
    class TextFieldEventListener implements ActionListener {
        // We override the actionPerformed() method as required by the ActionListener Interface
        @Override 
        public void actionPerformed( ActionEvent e ) {
            // When the user presses the <Enter> key:
            if ( inputField.getText().equals( "Enter total money (decimal value)" ) ) {
                JOptionPane.showMessageDialog( null, "Please a value!" );
            } 
            else {
                String moneyCount = inputField.getText();
                double money = Double.parseDouble( moneyCount );

                int tooniesCount = (int)money / 2;
                double remainder1 = money - ((int)money / 2 * 2);
                System.out.println(remainder1);
                int looniesCount = (int)remainder1;
                double remainder2 = remainder1 - looniesCount;
                System.out.println(remainder2);
                int quartersCount = (int)(remainder2 / 0.25);
                double remainder3 = remainder2 - (quartersCount * 0.25);
                System.out.println(remainder3);
                int dimesCount = (int)(remainder3 / 0.10);
                double remainder4 = remainder3 - (dimesCount * 0.10);
                System.out.println(remainder4);
                int nickelsCount = (int)(remainder4 / 0.05);
                double remainder5 = remainder4 - (nickelsCount * 0.05);
                System.out.println(remainder5);
                remainder5 = Math.round(remainder5 * 100.0) / 100.0; // Round to the nearest 0.01
                int penniesCount = (int)(remainder5 * 100);
                System.out.println(penniesCount);


                System.out.println(looniesCount);
                toonies.setText("Toonies: " + tooniesCount);
                loonies.setText("Loonies: " + looniesCount);
                quarters.setText("Quarters: " + quartersCount);
                dimes.setText("Dimes: " + dimesCount);
                nickels.setText("Nickels: " + nickelsCount);
                pennies.setText("Pennies: " + penniesCount);
            }
        }
    }
}