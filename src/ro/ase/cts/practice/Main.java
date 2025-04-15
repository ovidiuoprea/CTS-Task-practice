package ro.ase.cts.practice;

import ro.ase.cts.practice.enums.FeatureType;
import ro.ase.cts.practice.models.factory.AFeature;
import ro.ase.cts.practice.models.factory.FeatureFactoryMethod;

public class Main {
    public static void main(String[] args) {

        FeatureFactoryMethod featureFactory = new FeatureFactoryMethod();

        AFeature antenna = featureFactory.getFeature(FeatureType.ANTENNA, "Antenna", 50);
        AFeature battery = featureFactory.getFeature(FeatureType.BATTERY, "Battery", 100);
        AFeature compass = featureFactory.getFeature(FeatureType.COMPASS, "Compass", 150);
        AFeature speaker = featureFactory.getFeature(FeatureType.SPEAKER, "Speaker", 200);


        System.out.println(antenna);
        System.out.println(battery);
        System.out.println(compass);
        System.out.println(speaker);
    }
}