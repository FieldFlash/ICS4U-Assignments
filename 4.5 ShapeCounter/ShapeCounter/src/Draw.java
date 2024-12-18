import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Draw {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Shapes");

        frame.setLayout(new BorderLayout());

        DrawPanel drawPanel = new DrawPanel();
        JLabel label = new JLabel(drawPanel.toString());
        frame.add(drawPanel, BorderLayout.CENTER);
        frame.add(label, BorderLayout.SOUTH);

        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
