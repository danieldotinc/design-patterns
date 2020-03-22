package com.codewithmosh.template.course;

public abstract class BaseTask {
    private Auditrail auditrail;
    public BaseTask(){
        auditrail = new Auditrail();
    }
    public BaseTask(Auditrail auditrail) {
        this.auditrail = auditrail;
    }
    public void execute(){
        auditrail.record();
        execTask();
    }
    protected abstract void execTask();
}
