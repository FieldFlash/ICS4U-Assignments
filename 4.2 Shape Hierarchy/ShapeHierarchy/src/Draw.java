
import javax.swing.JFrame;


public class Draw {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Shapes");

        DrawPanel drawPanel = new DrawPanel();
        frame.add(drawPanel);

        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
