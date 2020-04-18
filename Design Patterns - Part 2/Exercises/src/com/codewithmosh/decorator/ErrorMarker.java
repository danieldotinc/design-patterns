package com.codewithmosh.decorator;

public class ErrorMarker implements Marker{
    private Marker artefact;
    public ErrorMarker(Marker artefact){
        this.artefact = artefact;
    }

    @Override
    public String render() {
       String errorMark = String.format("%s %s", artefact.render(), "[Error]");
       return errorMark;
    }
}
