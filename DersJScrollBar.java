package org.example;

import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class DersJScrollBar {
    public static void main(String[] args) {
        // JScrollBar

        JFrame frame = new JFrame("JScrollBar Ornegi");
        JLabel lbl = new JLabel("as");
        lbl.setBounds(100, 50, 300, 30);

        JScrollBar s = new JScrollBar(JScrollBar.VERTICAL, 0, 0, 0, 100);
        s.setBounds(100, 100, 50, 100);

        s.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                lbl.setText("ScrollBar degeri : " + (s.getValue() + s.getModel().getExtent()));
            }
        });
        frame.add(lbl);
        frame.add(s);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
