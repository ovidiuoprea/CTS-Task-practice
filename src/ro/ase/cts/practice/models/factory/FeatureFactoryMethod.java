package ro.ase.cts.practice.models.factory;

import ro.ase.cts.practice.enums.FeatureType;
import ro.ase.cts.practice.models.factory.features.Antenna;
import ro.ase.cts.practice.models.factory.features.Battery;
import ro.ase.cts.practice.models.factory.features.Compass;
import ro.ase.cts.practice.models.factory.features.Speaker;

public class FeatureFactoryMethod implements IFeatureFactory {
    @Override
    public AFeature getFeature(FeatureType featureType, String name, int price) {
        return switch(featureType) {
            case ANTENNA -> new Antenna(name, price);
            case BATTERY -> new Battery(name, price);
            case COMPASS -> new Compass(name, price);
            case SPEAKER -> new Speaker(name, price);
        };
    }
}
