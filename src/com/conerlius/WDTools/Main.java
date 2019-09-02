package com.conerlius.WDTools;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // 设定为默认展示
        JFrame.setDefaultLookAndFeelDecorated(true);
        // 创建frame
        JFrame frame = new JFrame("Excel2Data");
        // 设定关闭的方式
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设定窗口的大小
        frame.setSize(600,800);
        // 获取GUI的JPanel
        JPanel panel = new MainView().mainPanel;
        // 设定为主要的panel
        frame.setContentPane(panel);
        // 打包处理
        frame.pack();
        // 设置为显示
        frame.setVisible(true);
    }
}
