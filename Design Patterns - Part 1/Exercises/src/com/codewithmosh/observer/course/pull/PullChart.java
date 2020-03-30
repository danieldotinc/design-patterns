package com.codewithmosh.observer.course.pull;

public class PullChart implements PullObserver {
    private PullDataSource dataSource;

    public PullChart(PullDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void updateState() {
        System.out.println("Chart Updated. New value: " + dataSource.getValue());
    }
}
