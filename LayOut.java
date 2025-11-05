package org.example;

import javax.swing.*;
import java.awt.*;

public class LayOut {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout");


        JButton button = new JButton("Button");
        JButton button2 = new JButton("Button2");
        JButton button3 = new JButton("Button3");
        JButton button4 = new JButton("Button4");
        JButton button5 = new JButton("Button5");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(button, BorderLayout.NORTH);
        panel.add(button2, BorderLayout.SOUTH);
        panel.add(button3, BorderLayout.EAST);
        panel.add(button4, BorderLayout.WEST);
        panel.add(button5, BorderLayout.CENTER);

        frame.add(panel);
        frame.pack();
        frame.setSize(400, 400);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
