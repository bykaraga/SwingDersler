package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DersFour {
    public static void main(String[] args){
        //JtextArea
        //ile yazilan kelime uzunlugu ve karekter sayisi bulma uygulamasi

        JFrame frame = new JFrame("TextArea ornegi");
     /*
     JtextArea ekleme foksiyonu
       JTextArea t = new JTextArea();
       t.setBounds(0,0,250,200);
        frame.add(t);
*/
        JLabel l1,l2;
        JTextArea area;
        JButton btn;

        l1 = new JLabel();
        l1.setBounds(50,25,100,30);

        l2 = new JLabel();
        l2.setBounds(160,25,100,30);

        area = new JTextArea();
        area.setBounds(20,75,250,200);

        btn = new JButton("HESAPLA");
        btn.setBounds(100,300,120,30);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
               String text = area.getText();
               String words[] = text.split("\\s");
               l1.setText("Kelime : "+words.length);
               l2.setText("karekter : "+text.length());
             }
        });





        frame.add(btn);
        frame.add(area);
        frame.add(l1);
        frame.add(l2);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
