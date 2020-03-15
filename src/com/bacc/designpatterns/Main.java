package com.bacc.designpatterns;

import com.bacc.designpatterns.iterator.BrowseHistory;
import com.bacc.designpatterns.iterator.Iterator;
import com.bacc.designpatterns.state.Canvas;
import com.bacc.designpatterns.state.SelectionIcon;
import com.bacc.designpatterns.strategy.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        execStatePattern();
        execIteratorPattern();
        execStrategyPattern();
    }

    public static void execStatePattern(){
        Canvas canvas = new Canvas(new SelectionIcon());
        canvas.mouseUp();
        canvas.mouseDown();
    }

    public static void execIteratorPattern(){
        BrowseHistory browseHistory = new BrowseHistory();
        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");
        Iterator iterator = browseHistory.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.getCurrent());
            iterator.next();
        }
    }

    public static void execStrategyPattern(){
        ImageStorage imageStorage = new ImageStorage();
        imageStorage.store("Image1",new PNGCompression(), new BlackAndWhiteFilter());
        imageStorage.store("Image1",new JPEGCompress(), new HighContrastFilter());
    }
}
