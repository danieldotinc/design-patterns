package com.codewithmosh.chainOfResponsibility;

public class Excel extends Reader {

    public Excel(Reader reader) {
        super(reader);
    }

    @Override
    boolean doRead(String fileName) {
        if (fileName.endsWith(".xls")) {
            System.out.println("Reading data from an Excel spreadsheet.");
            return true;
        }
        return false;
    }
}
