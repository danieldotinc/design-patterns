package com.codewithmosh.iterator.course;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private int lastIndex = 0;
//    private List<String> urls = new ArrayList<>();
    private String[] urls = new String[10];

    public void push(String url){
            urls[lastIndex++] = url;
    }

    public String pop(){
        return urls[--lastIndex];
    }

    public Iterator createIterator(){
        return new ArrayIterator(this);
    }


//    public void push (String url) {
//        urls.add(url);
//    }

//    public String pop(){
//        int lastinx = urls.size() - 1;
//        String lastItem = urls.get(lastinx);
//        urls.remove(lastinx);
//
//        return lastItem;
//    }

//    public Iterator createIterator(){
//        return new ListIterator(this);
//    }

    public class ArrayIterator implements Iterator<String>{
        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history){
            this.history = history;
        }
        @Override
        public boolean hasNext() {
            return index < history.lastIndex;
        }

        @Override
        public String getCurrent() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }

//    public class ListIterator implements Iterator<String>{
//        private BrowseHistory history;
//        private int index = 0;
//
//        public ListIterator(BrowseHistory browseHistory){
//            this.history = browseHistory;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return index < history.urls.size();
//        }
//
//        @Override
//        public String getCurrent() {
//            return history.urls.get(index);
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//    }
}
