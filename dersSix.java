package org.example;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class dersSix {
    //JCheckBox
    public static void main(String[] args) {


        JFrame frame = new JFrame("JCheckBox ornegi");
        JLabel lb = new JLabel("Secim yapin !");
        lb.setBounds(100, 50, 300, 50);
        JCheckBox box1 = new JCheckBox("evet");
        JCheckBox box2 = new JCheckBox("hayir");
        box1.setBounds(100, 100, 250, 50);
        box2.setBounds(100, 150, 250, 50);


// secim kutusunu sectigin anda isleme sokuyor
        box1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                lb.setText("c++ Secim kutusu " + (e.getStateChange() == 1 ? "secildi" : "secilmedi"));
            }
        });
        box2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                lb.setText("JAVA Secim kutusu " + (e.getStateChange() == 1 ? "secildi" : "secilmedi"));
            }
        });



        /* secili iken butona tikliyinca calistirtiyorum
         JButton btn = new JButton("Kontrol");
        btn.setBounds(100,200,100,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(box1.isSelected()){
                    System.out.println(box1.getText()+" Secildi !");
                }
                if(box2.isSelected()){
                    System.out.println(box2.getText()+" Secildi !");
                }
                else {
                    System.out.println("hic bir sey secilmedi");
                }
            }
        });  */


        frame.add(box1);
        frame.add(box2);
        //  frame.add(btn);
        frame.add(lb);


        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
