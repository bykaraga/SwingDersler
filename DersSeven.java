package org.example;

import javax.swing.*;

public class DersSeven {
    public static void main(String[] args) {
//JRadioButton

        JFrame frame = new JFrame("RadioButton Ornegi");
        JRadioButton rbtn = new JRadioButton("radio button Orneki");
        rbtn.setBounds(10, 10, 100, 50);
        frame.add(rbtn);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
