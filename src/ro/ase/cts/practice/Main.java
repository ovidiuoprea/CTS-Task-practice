package ro.ase.cts.practice;

import ro.ase.cts.practice.enums.CallType;
import ro.ase.cts.practice.enums.FeatureType;
import ro.ase.cts.practice.models.builder.Phone;
import ro.ase.cts.practice.models.builder.PhoneBuilder;
import ro.ase.cts.practice.models.factory.AFeature;
import ro.ase.cts.practice.models.factory.FeatureFactoryMethod;
import ro.ase.cts.practice.models.factory.features.Antenna;
import ro.ase.cts.practice.models.factory.features.Battery;
import ro.ase.cts.practice.models.factory.features.Compass;
import ro.ase.cts.practice.models.factory.features.Speaker;
import ro.ase.cts.practice.models.prototype.OS;
import ro.ase.cts.practice.models.singleton.lazy.GSMConnection;
import ro.ase.cts.practice.models.singleton.registry.GSMConnectionManager;

public class Main {
    public static void main(String[] args) {

        FeatureFactoryMethod featureFactory = new FeatureFactoryMethod();

        AFeature antenna = featureFactory.getFeature(FeatureType.ANTENNA, "Antenna", 50);
        AFeature battery = featureFactory.getFeature(FeatureType.BATTERY, "Battery", 100);
        AFeature compass = featureFactory.getFeature(FeatureType.COMPASS, "Compass", 150);
        AFeature speaker = featureFactory.getFeature(FeatureType.SPEAKER, "Speaker", 200);


        System.out.println("Features factory method: ");
        System.out.println(antenna);
        System.out.println(battery);
        System.out.println(compass);
        System.out.println(speaker);

        System.out.println("\nGSM Connection singleton:");
        GSMConnection gsmConnection = GSMConnection.getInstance();
        gsmConnection.call();
        gsmConnection.call();
        System.out.println("GSM Connection active calls: " + gsmConnection.getActiveCalls());

        GSMConnection gsmConnection2 = GSMConnection.getInstance();

        if(!gsmConnection.equals(gsmConnection2)) {
            throw new RuntimeException("Singleton instance is not unique!");
        }

        System.out.println("\nGSM Connection singleton registry:");
        GSMConnectionManager connectionPriority = GSMConnectionManager.getInstance(CallType.PRIORITY);
        GSMConnectionManager connectionPriority2 = GSMConnectionManager.getInstance(CallType.PRIORITY);

        if(!connectionPriority.equals(connectionPriority2)) {
            throw new RuntimeException("Singleton instance is not unique!");
        }

        connectionPriority.call();
        System.out.println("GSM Priority connection (registry) active calls: " + connectionPriority.getActiveCalls());

        System.out.println("\nPhone builder: ");


        Phone phone = new PhoneBuilder("Phone 1", "0.0.1alpha")
                .build();

        System.out.println(phone);

        Phone phone2 = new PhoneBuilder("Phone 2", "0.1.0alpha")
                .addAntenna((Antenna) antenna)
                .addBattery((Battery) battery)
                .build();

        System.out.println(phone2);

        Phone phone3 = new PhoneBuilder("Phone 3", "0.2.0alpha")
                .addAntenna((Antenna) antenna)
                .addBattery((Battery) battery)
                .addCompass((Compass) compass)
                .addSpeaker((Speaker) speaker)
                .build();

        System.out.println(phone3);

        System.out.println("\nOS Prototype: ");
        try {
            OS os = new OS(1);

            OS os2 = (OS)os.clone();

            System.out.println("Cloned OS: " + os2);
        } catch (InterruptedException | CloneNotSupportedException e) {
            System.out.println("Could not create / clone OS instance due to " + e.getMessage());
        }

    }
}