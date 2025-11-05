package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DersCombobox {
    public static void main(String[] args) {
//JComboBox

        JFrame frame = new JFrame("ComboBox Ornegi");
        String arr[] = {"", "JAVA", "C", "C++", "C#"};
        JComboBox cb = new JComboBox(arr);
        cb.setBounds(10, 10, 300, 30);


        JButton btn = new JButton("OK");
        btn.setBounds(10, 50, 100, 30);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "Secilen proglama dili : " + cb.getSelectedItem();
                System.out.println(text);
            }
        });
        frame.add(btn);
        frame.add(cb);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
