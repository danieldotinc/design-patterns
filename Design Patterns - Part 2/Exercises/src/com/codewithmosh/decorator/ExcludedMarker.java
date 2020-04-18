package com.codewithmosh.decorator;

public class ExcludedMarker implements Marker{
    private Marker artefact;
    public ExcludedMarker(Marker artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        String excludeMark = String.format("%s %s", artefact.render(), "[Excluded]");
        return excludeMark;
    }
}
