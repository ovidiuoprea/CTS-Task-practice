package ro.ase.cts.practice.models.builder;

import ro.ase.cts.practice.models.factory.features.Antenna;
import ro.ase.cts.practice.models.factory.features.Battery;
import ro.ase.cts.practice.models.factory.features.Compass;
import ro.ase.cts.practice.models.factory.features.Speaker;

public class PhoneBuilder extends APhoneBuilder {
    Phone phone;

    @Override
    public APhoneBuilder addAntenna(Antenna antenna) {
        return null;
    }

    @Override
    public APhoneBuilder addBattery(Battery battery) {
        return null;
    }

    @Override
    public APhoneBuilder addCompass(Compass compass) {
        return null;
    }

    @Override
    public APhoneBuilder addSpeaker(Speaker speaker) {
        return null;
    }

    @Override
    public Phone build() {
        return null;
    }
}
