package org.example;

import javax.swing.*;

public class DersJTabbedPane {
    public static void main(String[] args) {
//JTabbedPane

        JFrame frame = new JFrame("JTabbedPane Ornegi");


        JLabel lb1 = new JLabel("Ilk Alan");
        JPanel p1 = new JPanel();
        p1.add(lb1);

        JLabel lb2 = new JLabel("ikinci alan");
        JPanel p2 = new JPanel();
        p2.add(lb2);

        JLabel lb3 = new JLabel("ucuncu  alan");
        JPanel p3 = new JPanel();
        p3.add(lb3);


        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 200, 200);
        tp.add("Birinci", p1);
        tp.add("Ikinci", p2);
        tp.add("Ucuncu", p3);

        frame.add(tp);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
