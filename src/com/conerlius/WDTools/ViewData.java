package com.conerlius.WDTools;

public class ViewData {
    private MainView mainView;
    public String ExcelsPath;

    public void SetExcelsPath(String name) {
        ExcelsPath = name;
        mainView.textField1.setText(ExcelsPath);
    }

    public void BindView(MainView _mainView) {
        mainView = _mainView;
    }
}
