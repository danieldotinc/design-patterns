package com.codewithmosh.decorator;

public class NotCommittedMarker implements Marker {
    private Marker artefact;
    public NotCommittedMarker(Marker artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        String notCommittedMark = String.format("%s %s", artefact.render(), "[NotCommitted]");
        return notCommittedMark;
    }
}
