package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DersFive {
    public static void main(String[] args){
       //JPasswordField

        JFrame frame = new JFrame("JPasswordField Ornegi");

        JLabel l1 = new JLabel("Password : ");
        l1.setBounds(20,20,120,30);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(20,50,100,30);

        JButton b1 = new JButton("OK");
        b1.setBounds(20,80,100,30);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              // String password =  new String(pass.getPassword()); sifreyi gosterme
                l1.setText(l1.getText() + pass.getPassword());
            }
        });



        frame.add(l1);
        frame.add(b1);
        frame.add(l1);
        frame.add(pass);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
