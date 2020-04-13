package com.codewithmosh.visitor;

public interface Operation {
    public void apply(FormatSegment formatSegment);
    public void apply(FactSegment factSegment);
}
