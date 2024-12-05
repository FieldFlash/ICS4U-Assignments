import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        String choiceStr = JOptionPane.showInputDialog("Enter 1 for rectangle and 2 for oval");
        int choice = Integer.parseInt(choiceStr);
        Panel panel = new Panel(choice);

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
