package org.example;

import javax.swing.*;

public class DersJoptionPane {
    public static void main(String[] args) {
//JOptionPane

        JFrame frame = new JFrame("JOptionPane Ornegi");

        JOptionPane.showMessageDialog(frame, "Merhaba hosgeldin");
        String str = JOptionPane.showInputDialog(frame, "Adiniz");
        System.out.println(str);
        JOptionPane.showMessageDialog(frame, "ABone oldun", "Abone OL ", JOptionPane.WARNING_MESSAGE);


        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
