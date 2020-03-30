package com.codewithmosh.command.course.editor;

public interface UndoableCommand extends Command {
    public void unexecute();
}
