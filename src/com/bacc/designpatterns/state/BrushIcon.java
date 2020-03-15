package com.bacc.designpatterns.state;

public class BrushIcon implements Tool {
    @Override
    public void mouseUp() {
        System.out.printf("Brush Icon");
    }

    @Override
    public void mouseDown() {
        System.out.printf("Brushing ...");
    }
}
