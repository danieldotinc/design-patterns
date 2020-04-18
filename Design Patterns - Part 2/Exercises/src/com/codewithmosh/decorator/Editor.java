package com.codewithmosh.decorator;

public class Editor {
    public void openProject(String path) {
        Marker[] artefacts = {
                new Artefact("Main"),
                new Artefact("Demo"),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider"),
        };

        artefacts[0] = new MainMarker(artefacts[0]);
        artefacts[2] = new NotCommittedMarker(new ErrorMarker(artefacts[2]));
        artefacts[1] = new ExcludedMarker(artefacts[1]);

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
