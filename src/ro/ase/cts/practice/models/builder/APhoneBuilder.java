package ro.ase.cts.practice.models.builder;

import ro.ase.cts.practice.models.factory.features.Antenna;
import ro.ase.cts.practice.models.factory.features.Battery;
import ro.ase.cts.practice.models.factory.features.Compass;
import ro.ase.cts.practice.models.factory.features.Speaker;

public abstract class APhoneBuilder {
    public abstract APhoneBuilder addAntenna(Antenna antenna);
    public abstract APhoneBuilder addBattery(Battery battery);
    public abstract APhoneBuilder addCompass(Compass compass);
    public abstract APhoneBuilder addSpeaker(Speaker speaker);

    public abstract Phone build();
}
