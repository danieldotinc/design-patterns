package com.codewithmosh.state.course;

public class Canvas implements Tool{
    private Tool currentTool;

    public Canvas(Tool currentTool){
        this.currentTool = currentTool;
    }

    @Override
    public void mouseDown() {
        currentTool.mouseDown();
    }

    @Override
    public void mouseUp() {
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }
}
