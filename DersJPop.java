package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DersJPop {
    public static void main(String[] args) {
//JPopup menu          fareye sag tikladiginda acilan menu turu gibi dusun


        JFrame frame = new JFrame("JPopupMenu Ornegi");


        JPopupMenu popup = new JPopupMenu("Menu");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        popup.add(cut);
        popup.add(copy);
        popup.add(paste);

        //frame sag tiklma acma(her iki fare tiklamasina bakiyor )

        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                popup.show(frame, e.getX(), e.getY());
            }
        });

        cut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Cut");
            }
        });

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
