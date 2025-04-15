package ro.ase.cts.practice.models.singleton.registry;

import ro.ase.cts.practice.IGSMConnection;
import ro.ase.cts.practice.enums.CallType;

import java.util.HashMap;

public class GSMConnectionManager implements IGSMConnection {
    private int activeCalls;

    private static HashMap<CallType, GSMConnectionManager> instances = new HashMap<>();

    private GSMConnectionManager() {
        this.activeCalls = 0;
    }

    public static GSMConnectionManager getInstance(CallType callType) {
        GSMConnectionManager instance = instances.get(callType);
        if(instance == null) {
            instance = new GSMConnectionManager();
            instances.put(callType, instance);
        }

        return instance;
    }

    @Override
    public void call() {
        this.activeCalls++;
    }

    public int getActiveCalls() {
        return activeCalls;
    }
}
