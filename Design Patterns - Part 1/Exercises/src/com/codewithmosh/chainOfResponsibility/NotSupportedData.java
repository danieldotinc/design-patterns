package com.codewithmosh.chainOfResponsibility;

public class NotSupportedData extends Reader{
    public NotSupportedData(Reader reader) {
        super(reader);
    }

    @Override
    boolean doRead(String fileName) {
        System.out.println("File format not supported.");
        return true;
    }
}
