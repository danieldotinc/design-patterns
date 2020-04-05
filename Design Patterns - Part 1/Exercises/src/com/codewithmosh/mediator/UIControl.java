package com.codewithmosh.mediator;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();
    public void registerEventHandler(EventHandler eventHandler){
        eventHandlers.add(eventHandler);
    }

    public void notifyEventHandlers(){
        for (EventHandler eventHandler: eventHandlers)
            eventHandler.handle();
    }

}
