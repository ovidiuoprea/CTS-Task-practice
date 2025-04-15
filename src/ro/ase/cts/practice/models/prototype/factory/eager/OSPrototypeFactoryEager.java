package ro.ase.cts.practice.models.prototype.factory.eager;

import ro.ase.cts.practice.enums.OSVersion;
import ro.ase.cts.practice.exceptions.OSVersionNotImplementedException;
import ro.ase.cts.practice.models.prototype.OS;

import java.util.HashMap;

public class OSPrototypeFactoryEager {
    private static HashMap<OSVersion, OS> versions = new HashMap<>();

    static {
        try {
            versions.put(OSVersion.VERSION_1, new OS(1));
            versions.put(OSVersion.VERSION_2, new OS(2));
            versions.put(OSVersion.VERSION_3, new OS(3));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Propagate CloneNotSupported exception to the client to ensure we either return a valid OS or an OS not implemented exception.
    public static OS getOS(OSVersion version) throws CloneNotSupportedException {
        if(versions.get(version) == null) {
            throw new OSVersionNotImplementedException();
        }
        return (OS) versions.get(version).clone();
    }
}
