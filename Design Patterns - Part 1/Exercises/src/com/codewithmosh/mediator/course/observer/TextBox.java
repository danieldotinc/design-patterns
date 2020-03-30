package com.codewithmosh.mediator.course.observer;

public class TextBox extends UIControl {
    private String content;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyEventHandlers();
    }
}
