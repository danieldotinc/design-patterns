package com.codewithmosh.flyweight;

public class CellFormat {
    private String fontFamily;
    private int fontSize;
    private boolean isBold;

    public CellFormat(String fontFamily, int fontSize, boolean isBold) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.isBold = isBold;
    }


    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public boolean isBold() {
        return isBold;
    }

    public void setBold(boolean bold) {
        isBold = bold;
    }
}
