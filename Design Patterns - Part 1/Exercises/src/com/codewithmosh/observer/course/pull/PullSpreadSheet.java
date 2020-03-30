package com.codewithmosh.observer.course.pull;


public class PullSpreadSheet implements PullObserver {
    private PullDataSource dataSource;

    public PullSpreadSheet(PullDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void updateState() {
        System.out.println("SpreadSheet Updated. New value: " + dataSource.getValue());
    }
}
