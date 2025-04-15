package ro.ase.cts.practice.models.builder;

import ro.ase.cts.practice.models.factory.AFeature;
import ro.ase.cts.practice.models.prototype.OS;

public class Phone {
    String identifier;
    String version;
    AFeature battery;
    AFeature antenna;
    AFeature compass;
    AFeature speaker;

    OS os;

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

    public void setOs(OS os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "identifier='" + identifier + '\'' +
                ", version='" + version + '\'' +
                ", battery=" + battery +
                ", antenna=" + antenna +
                ", compass=" + compass +
                ", speaker=" + speaker +
                '}';
    }
}
