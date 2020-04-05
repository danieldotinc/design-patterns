package com.codewithmosh.chainOfResponsibility;

public class QuickBook extends Reader {

    public QuickBook(Reader reader) {
        super(reader);
    }

    @Override
    boolean doRead(String fileName) {
        if (fileName.endsWith(".qbw")) {
            System.out.println("Reading data from a QuickBooks file.");
            return true;
        }
        return false;
    }
}
