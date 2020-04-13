package com.codewithmosh.visitor.course;

public interface Operation {
    void apply(HeadingNode heading);
    void apply(AnchorNode anchor);
}
