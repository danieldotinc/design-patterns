package com.codewithmosh.decorator;

public class MainMarker implements Marker{
    private Marker artefact;
    public MainMarker(Marker artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        String mainMark = String.format("%s %s", artefact.render(), "[Main]");
        return mainMark;
    }
}
