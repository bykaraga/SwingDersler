package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //JButton
        //button.setBounds(x,y,width,height);

        JFrame frame = new JFrame("Buton ornegi");

     // JButton button = new JButton("Gonder"); /* yada assagidaki ornek ile de button tanimliyabiliyoruz */
                JButton button = new JButton();

                 button.setText("Gonder");
                 button.setBounds(0,0,100,20);

         button.addActionListener(new ActionListener(){

             @Override
             public void actionPerformed(ActionEvent e) {
                 System.out.println("butona tikladiginda konsola mesaj yolladin ");}
         });



        frame.add(button);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
