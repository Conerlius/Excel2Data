package com.conerlius.WDTools;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class ViewData implements ListModel {
    private MainView mainView;
    public String ExcelsPath;
    ArrayList allFiles = new ArrayList<String>();
public  ViewData(){
    CacheAllFiles();
}

    public void SetExcelsPath(String name) {
        ExcelsPath = name;
        mainView.textField1.setText(ExcelsPath);
        CacheAllFiles();
    }
    private void CacheAllFiles(){
        for (int i=0; i < 15; i++) {
            allFiles.add(i);
        }
    }
    public void BindView(MainView _mainView) {
        mainView = _mainView;
    }

    @Override
    public int getSize() {
        return allFiles.size();
    }

    @Override
    public Object getElementAt(int index) {
        return allFiles.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }
}
