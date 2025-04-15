package ro.ase.cts.practice.models.builder;

import ro.ase.cts.practice.models.factory.features.Antenna;
import ro.ase.cts.practice.models.factory.features.Battery;
import ro.ase.cts.practice.models.factory.features.Compass;
import ro.ase.cts.practice.models.factory.features.Speaker;

public class PhoneBuilder extends APhoneBuilder {
    Phone phone;

    PhoneBuilder(String identifier, String version) {
        phone = new Phone(identifier, version);
    }
    @Override
    public APhoneBuilder addAntenna(Antenna antenna) {
        phone.setAntenna(antenna);
        return this;
    }

    @Override
    public APhoneBuilder addBattery(Battery battery) {
        phone.setBattery(battery);
        return this;
    }

    @Override
    public APhoneBuilder addCompass(Compass compass) {
        phone.setCompass(compass);
        return this;
    }

    @Override
    public APhoneBuilder addSpeaker(Speaker speaker) {
        phone.setSpeaker(speaker);
        return this;
    }

    @Override
    public Phone build() {
        return this.phone;
    }
}
