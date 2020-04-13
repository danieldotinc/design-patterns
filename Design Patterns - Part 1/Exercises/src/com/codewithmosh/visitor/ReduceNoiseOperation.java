package com.codewithmosh.visitor;

public class ReduceNoiseOperation implements Operation{

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("ReduceNoise-FormatSegment");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("ReduceNoise-FactSegment");
    }
}
