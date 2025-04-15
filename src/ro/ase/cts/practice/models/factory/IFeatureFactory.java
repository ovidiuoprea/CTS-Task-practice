package ro.ase.cts.practice.models.factory;

import ro.ase.cts.practice.enums.FeatureType;

public interface IFeatureFactory {
    public AFeature getFeature(FeatureType feature, String name, int price);
}
