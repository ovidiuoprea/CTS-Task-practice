package ro.ase.cts.practice.models.builder;

import ro.ase.cts.practice.models.factory.AFeature;

public class Phone {
    String identifier;
    String version;
    AFeature battery;
    AFeature antenna;
    AFeature compass;
    AFeature speaker;

    public Phone(String identifier, String version) {
        this.identifier = identifier;
        this.version = version;
    }
}
