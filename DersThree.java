package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DersThree {
    public static void main(String[] args){
     //JTextField
        // textfield ile toplama islemi yapan hesap makinesi
        JFrame frame = new JFrame("TextField ornegi");

        JTextField t1,t2,t3;
        JLabel l1 ,l2,l3;
        JButton b1,b2;

        l1 = new JLabel("Ilk Sayi");
        l1.setBounds(50,10,100,30);

        t1 = new JTextField();
        t1.setBounds(50,50,100,20);

        l2 = new JLabel("ikinci Sayi");
        l2.setBounds(50,90,100,30);

        t2 = new JTextField();
        t2.setBounds(50,130,100,20);

        l3 = new JLabel("Sonuc");
        l3.setBounds(50,150,100,30);

        t3 = new JTextField();
        t3.setBounds(50,180,100,25);
        t3.setEditable(false);

        b1 = new JButton("toplam");
        b1.setBounds(50,210,100,30);

b1.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a+b;

        String toplam = String.valueOf(c);
        t3.setText(toplam);
    }
});


        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(b1);
        frame.add(l3);
        frame.add(t3);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
