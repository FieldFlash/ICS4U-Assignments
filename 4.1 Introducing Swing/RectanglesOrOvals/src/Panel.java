import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel {
    private int choice;

    public Panel(int choice) {
        this.choice = choice;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (choice == 1) {
            System.out.println("DrawRectangles");
            for (int i = 1; i <= 10; i++) {
                g.drawRect(i * 10, i * 10, i * 15, i * 15);
            }
        } else if (choice == 2) {
            System.out.println("DrawOvals");
            for (int i = 1; i <= 10; i++) {
                g.drawOval(i * 10, i * 10, i * 15, i * 15);
            }
        }
    }
}
