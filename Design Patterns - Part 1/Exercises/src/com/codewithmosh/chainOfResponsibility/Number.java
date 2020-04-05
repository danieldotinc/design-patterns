package com.codewithmosh.chainOfResponsibility;

public class Number extends Reader {
    public Number(Reader reader) {
        super(reader);
    }

    @Override
    boolean doRead(String fileName) {
        if (fileName.endsWith(".numbers")) {
            System.out.println("Reading data from a Numbers spreadsheet.");
            return true;
        }

        return false;
    }
}
