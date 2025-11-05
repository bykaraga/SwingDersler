package org.example;

import javax.swing.*;

public class DersJPrograssBar {
    public static void main(String[] args) {
//JPrograssBar

        JFrame frame = new JFrame("JPrograssBar Ornegi");


        JProgressBar jb = new JProgressBar(0, 2000);
        jb.setBounds(40, 50, 300, 30);
        jb.setValue(0);
        jb.setStringPainted(true);


        frame.add(jb);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int i = 0;
        while (i <= 2000) {
            jb.setValue(i);
            i += 20;
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }


        }
    }
}