package ro.ase.cts.practice.models.builder;

import ro.ase.cts.practice.models.factory.AFeature;

public class Phone {
    String identifier;
    String version;
    AFeature battery;
    AFeature antenna;
    AFeature compass;
    AFeature speaker;

    Phone(String identifier, String version) {
        this.identifier = identifier;
        this.version = version;
    }

    void setBattery(AFeature battery) {
        this.battery = battery;
    }

    void setAntenna(AFeature antenna) {
        this.antenna = antenna;
    }

    void setCompass(AFeature compass) {
        this.compass = compass;
    }

    void setSpeaker(AFeature speaker) {
        this.speaker = speaker;
    }
}
