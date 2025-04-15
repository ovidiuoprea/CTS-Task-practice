package ro.ase.cts.practice.models.singleton.lazy;

import ro.ase.cts.practice.IGSMConnection;

public class GSMConnection implements IGSMConnection {
    private int activeCalls;

    private static GSMConnection instance = null;

    private GSMConnection() {
        this.activeCalls = 0;
    }

    public static GSMConnection getInstance() {
        if(instance == null) {
            instance = new GSMConnection();
        }
        return instance;
    }

    public int getActiveCalls() {
        return activeCalls;
    }

    @Override
    public void call() {
        this.activeCalls++;
    }
}
