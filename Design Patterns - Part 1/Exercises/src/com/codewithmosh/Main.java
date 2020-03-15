package com.codewithmosh;

import com.codewithmosh.iterator.Iterator;
import com.codewithmosh.iterator.Product;
import com.codewithmosh.iterator.ProductCollection;
import com.codewithmosh.memento.DocHistory;
import com.codewithmosh.memento.Document;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        execStatePattern();
        execIteratorPattern();
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


    public static void execStatePattern(){
        Document document = new Document();
        DocHistory docHistory = new DocHistory();

        document.setContent("Daniel");
        document.setFontName("Sans");
        document.setFontSize(12);
        docHistory.push(document.createState());
        System.out.println(document.getContent());
        System.out.println(document.getFontName());
        System.out.println(document.getFontSize());

        document.setContent("Dani");
        document.setFontName("SansSharif");
        document.setFontSize(14);
        document.createState();
        docHistory.push(document.createState());

        document.setFontSize(13);

        document.restoreState(docHistory.pop());


        System.out.println(document.getContent());
        System.out.println(document.getFontName());
        System.out.println(document.getFontSize());

    }
}
