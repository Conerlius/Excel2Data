package com.conerlius.WDTools;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class MainView {
    public JPanel mainPanel;
    public JTextField textField1;
    private JButton button1;
    private JList list1;
    private ViewData viewData = new ViewData();

    public MainView() {
        viewData.BindView(this);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JFileChooser jfc=new JFileChooser();
                jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY );
                jfc.showDialog(new JLabel(), "选择");
                File file=jfc.getSelectedFile();
                if (file == null)
                    return;
                viewData.SetExcelsPath(file.getPath());
            }
        });
    }
}
