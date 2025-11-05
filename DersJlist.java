package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DersJlist {
    public static void main(String[] args) {


        JFrame frame = new JFrame(" Ornegi");


        DefaultListModel<String> listmodel = new DefaultListModel<>();
        listmodel.addElement("Java");
        listmodel.addElement("C");
        listmodel.addElement("C#");
        listmodel.addElement("C++");
        listmodel.addElement("php");

        JList<String> list = new JList<>(listmodel);
        list.setBounds(10, 10, 85, 100);
        list.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);

        DefaultListModel<String> l1 = new DefaultListModel<>();

        l1.addElement("Lara");
        l1.addElement("react");
        l1.addElement("swing");
        l1.addElement("Vuejs");

        JList<String> l2 = new JList<>(l1);
        l2.setBounds(10, 150, 85, 100);

        JButton btn1 = new JButton("OK");
        btn1.setBounds(110, 220, 100, 30);

        btn1.addActionListener(new ActionListener() {
            String txt = "";

            @Override
            public void actionPerformed(ActionEvent e) {
                if (list.getSelectedIndex() != -1) {
                    txt = "Secilen Programlama dilleri : " + list.getSelectedValue();
                }
                if (l2.getSelectedIndex() != -1) {
                    txt += " , Secilen Framework : ";
                    for (Object item : l2.getSelectedValuesList()) {
                        txt += item + " ";
                    }
                }
                System.out.println(txt);
            }
        });

        frame.add(btn1);
        frame.add(l2);
        frame.add(list);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
