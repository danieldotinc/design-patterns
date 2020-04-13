package com.codewithmosh.visitor;

public class AddReverbOperation implements Operation{
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("AddReverb-FormatSegment");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("AddReverb-FactSegment");
    }
}
