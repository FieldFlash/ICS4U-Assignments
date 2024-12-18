import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    Random rand = new Random();
    Shape[] shapes = new Shape[10];
    int rectCount = 0;
    int ovalCount = 0;
    int lineCount = 0;

    public DrawPanel() {
        setBackground(Color.WHITE);
        for (int i = 0; i < shapes.length; i++) {
            Color randomColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            int randomShape = rand.nextInt(3); // Change to 3 to include Line

            switch (randomShape) {
                case 0:
                    shapes[i] = new Rectangle(rand.nextInt(500) + 1, rand.nextInt(500) + 1, rand.nextInt(500) + 1, rand.nextInt(500) + 1, randomColor, rand.nextBoolean());
                    rectCount++;
                    break;
                case 1:
                    shapes[i] = new Oval(rand.nextInt(500) + 1, rand.nextInt(500) + 1, rand.nextInt(500) + 1, rand.nextInt(500) + 1, randomColor, rand.nextBoolean());
                    ovalCount++;
                    break;
                case 2:
                    shapes[i] = new Line(rand.nextInt(500) + 1, rand.nextInt(500) + 1, rand.nextInt(500) + 1, rand.nextInt(500) + 1, randomColor);
                    lineCount++;
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    @Override
    public String toString() {
        return "Rectangles: " + rectCount + " Ovals: " + ovalCount + " Lines: " + lineCount;
    }
}
