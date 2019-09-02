package com.conerlius.WDTools;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Excel2Data");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,800);
        JPanel panel = new MainView().mainPanel;
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
