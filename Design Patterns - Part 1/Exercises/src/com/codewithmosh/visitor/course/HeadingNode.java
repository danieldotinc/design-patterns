package com.codewithmosh.visitor.course;

public class HeadingNode implements HtmlNode{
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
