package com.codewithmosh.visitor;

public class FactSegment implements Segment {
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
