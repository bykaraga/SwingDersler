package org.example;

import javax.swing.*;

public class DersJtable {
    public static void main(String[] args) {
//JTable

        JFrame frame = new JFrame("JTable Ornegi");

        String[][] veri = {{"1", "mat", "85"}, {"2", "fen", "90"}, {"3", "tur", "100"}};
        String[] baslik = {"ID", "Ders", "Not"};

        JTable table = new JTable(veri, baslik);
        table.setBounds(30, 40, 200, 300);

        JScrollPane Pane = new JScrollPane(table);
        Pane.setBounds(10, 40, 200, 300);

        frame.add(Pane);

        frame.setSize(400, 400);
       
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
