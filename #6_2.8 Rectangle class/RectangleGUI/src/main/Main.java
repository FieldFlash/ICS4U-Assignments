package main;

import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Rectangle GUI");
        window.setSize(500, 500);
        window.setVisible(true);
        window.getContentPane().add(new CustomGraphics());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class CustomGraphics extends JComponent{ 
    @Override
    public void paint(Graphics g){
        MyRectangle rect = new MyRectangle(100, 100, 300, 200, true);
        rect.draw(g);
    }
}
