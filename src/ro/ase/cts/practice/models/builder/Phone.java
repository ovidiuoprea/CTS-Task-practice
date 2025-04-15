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

    public void setBattery(AFeature battery) {
        this.battery = battery;
    }

    public void setAntenna(AFeature antenna) {
        this.antenna = antenna;
    }

    public void setCompass(AFeature compass) {
        this.compass = compass;
    }

    public void setSpeaker(AFeature speaker) {
        this.speaker = speaker;
    }
}
