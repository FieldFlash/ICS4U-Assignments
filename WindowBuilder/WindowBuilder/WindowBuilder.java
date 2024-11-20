import javax.swing.*;
import java.awt.Color;
import helper_classes.*;

public class WindowBuilder {
  public static void main(String[] args) {

     JFrame frame = new JFrame("My Awesome Window");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(1005, 542);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#f4c064"));

     JLabel element1 = new JLabel("Hello");
     element1.setBounds(155, 98, 106, 18);
     element1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element1.setForeground(Color.decode("#000"));
     panel.add(element1);

     JPasswordField element2 = new JPasswordField("");
     element2.setBounds(238, 180, 106, 21);
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element2.setBackground(Color.decode("#ffe7bf"));
     element2.setForeground(Color.decode("#73664e"));
     element2.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element2, "Your Password!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element2);

     JTextField element3 = new JTextField("");
     element3.setBounds(239, 154, 106, 21);
     element3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element3.setBackground(Color.decode("#ffe7bf"));
     element3.setForeground(Color.decode("#73664e"));
     element3.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element3, "Your Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element3);

     JButton element4 = new JButton("Click Me");
     element4.setBounds(241, 294, 106, 29);
     element4.setBackground(Color.decode("#bca8e4"));
     element4.setForeground(Color.decode("#000"));
     element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element4.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element4.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element4, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     panel.add(element4);

     frame.add(panel);
     frame.setVisible(true);

  }
}