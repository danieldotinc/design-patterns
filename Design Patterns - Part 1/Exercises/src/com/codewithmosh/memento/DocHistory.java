package com.codewithmosh.memento;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class DocHistory {
    private List<DocState> states = new ArrayList<DocState>();
    public void push (DocState state) {
        states.add(state);
    }

    public DocState pop () {
        int lastIndex = states.size() - 1;

        if (lastIndex >= 0) {
            DocState lastState = states.get(lastIndex);
            states.remove(lastIndex);
            return lastState;
        }

        return states.get(0);
    }
}
