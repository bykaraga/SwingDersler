package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DersJmenu {
    public static void main(String[] args) {
//JMenu

        JFrame frame = new JFrame("Jmenu Ornegi");
        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("ana menu");
        JMenu subMenu = new JMenu("submenu");

        JMenuItem a1 = new JMenuItem("a1");
        JMenuItem a2 = new JMenuItem("a2");
        JMenuItem a3 = new JMenuItem("a3");
        JMenuItem a4 = new JMenuItem("a4");
        subMenu.add(a1);
        subMenu.add(a2);
        subMenu.add(a3);
        subMenu.add(a4);


        JMenuItem mi = new JMenuItem("Menu 1");
        JMenuItem mi2 = new JMenuItem("Menu 2");
        JMenuItem mi3 = new JMenuItem("Menu 3");
        JMenuItem mi4 = new JMenuItem("Menu 4");


        mi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Menu 1 tiklandi");
            }
        });


        m.add(mi);
        m.add(mi2);
        m.add(mi3);
        m.add(mi4);
        m.add(subMenu);

        mb.add(m);

        frame.setJMenuBar(mb);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
