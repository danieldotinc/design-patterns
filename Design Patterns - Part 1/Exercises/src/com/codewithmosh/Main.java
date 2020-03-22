package com.codewithmosh;

import com.codewithmosh.iterator.Iterator;
import com.codewithmosh.iterator.Product;
import com.codewithmosh.iterator.ProductCollection;
import com.codewithmosh.memento.DocHistory;
import com.codewithmosh.memento.Document;
import com.codewithmosh.state.*;
import com.codewithmosh.strategy.AESEncrypt;
import com.codewithmosh.strategy.ChatClient;
import com.codewithmosh.strategy.DESEncrypt;
import com.codewithmosh.template.VSCodeWin;
import com.codewithmosh.template.course.GenerateReportTask;
import com.codewithmosh.template.course.MoneyTransferTask;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //execMementoPattern();
        //execStatePattern();
        //execIteratorPattern();
        //execStrategyPattern();
        //execTemplatePattern();
    }

    public static void execTemplatePattern(){
        MoneyTransferTask moneyTransferTask = new MoneyTransferTask();
        moneyTransferTask.execute();

        GenerateReportTask generateReportTask = new GenerateReportTask();
        generateReportTask.execute();

        VSCodeWin vsCodeWin = new VSCodeWin();
        vsCodeWin.close();
    }

    public static void execStrategyPattern(){
        ChatClient chatClient = new ChatClient(new AESEncrypt());
        chatClient.send("ABC");

        ChatClient chatClient1 = new ChatClient(new DESEncrypt());
        chatClient1.send("ABC");
    }

    public static void execStatePattern(){
        DirectionService walking = new DirectionService(new Walking());
        System.out.println(walking.getDirection());
        System.out.println(walking.getEta());

        DirectionService bicycling = new DirectionService(new Bicycling());
        System.out.println(bicycling.getDirection());
        System.out.println(bicycling.getEta());

        DirectionService transit = new DirectionService(new Transit());
        System.out.println(transit.getDirection());
        System.out.println(transit.getEta());

        DirectionService driving = new DirectionService(new Driving());
        System.out.println(driving.getDirection());
        System.out.println(driving.getEta());

    }

    public static void execIteratorPattern(){
        Product product1 = new Product(1,"Wallet");
        Product product2 = new Product(2,"Belt");
        ProductCollection productCollection = new ProductCollection();
        productCollection.push(product1);
        productCollection.push(product2);

        Iterator iterator = productCollection.createIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.current().toString());
            iterator.next();
        }
    }


    public static void execMementoPattern(){
        Document document = new Document();
        DocHistory docHistory = new DocHistory();

        // First State
        document.setContent("Daniel");
        document.setFontName("Sans");
        document.setFontSize(12);
        docHistory.push(document.createState());

        System.out.println("Display: "+document.getContent() +" "+ document.getFontName() +" "+document.getFontSize());

        // Second State
        document.setContent("Dani");
        document.setFontName("MRT");
        document.setFontSize(14);
        docHistory.push(document.createState());

        System.out.println("Display: "+document.getContent() +" "+ document.getFontName() +" "+document.getFontSize());

        document.setFontSize(13);
        System.out.println("Display: "+document.getContent() +" "+ document.getFontName() +" "+document.getFontSize());

        System.out.println("undo ...");
        document.restoreState(docHistory.pop());
        System.out.println("Display: "+document.getContent() +" "+ document.getFontName() +" "+document.getFontSize());


        System.out.println("undo ...");
        document.restoreState(docHistory.pop());
        System.out.println("Display: "+document.getContent() +" "+ document.getFontName() +" "+document.getFontSize());

    }
}
