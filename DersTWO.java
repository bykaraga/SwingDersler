package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DersTWO {

        public static void main(String[] args) {
           // JLabel


            JFrame frame = new JFrame("Label ornegi");

            JLabel l1 = new JLabel();
            l1.setText("Yazi kismi");
            l1.setBounds(150, 50, 200, 200);

            //buton olusturalim
            JButton b1 = new JButton("Degistir");
            b1.setBounds(150, 200, 100, 60);

            b1.addActionListener(new ActionListener() {
                int c = 1 ;
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    l1.setText("Butona "+c++ + " kez tiklandi");
                }
            });




            frame.add(b1);
            frame.add(l1);
            frame.setSize(400,400);
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
