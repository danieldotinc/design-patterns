package com.codewithmosh.command.course.editor;

public class HtmlDocument {
    private String content;
    public HtmlDocument(String content) {
        this.content = content;
    }

    public void makeBold(){
        content = "<b>" + content + "<b>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
