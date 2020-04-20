package com.codewithmosh.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CellFormatFactory {
    private Map<Integer,CellFormat> cellFormatMap = new HashMap<>();

    public CellFormat getCellFormat(String fontFamily, int fontSize, boolean isBold){
        Integer hash = Objects.hash(fontFamily,fontSize,isBold);
        if(!cellFormatMap.containsKey(hash)) cellFormatMap.put(hash, new CellFormat(fontFamily,fontSize,isBold));
        return cellFormatMap.get(hash);
    }
}
