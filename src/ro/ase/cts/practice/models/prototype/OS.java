package ro.ase.cts.practice.models.prototype;

public class OS implements Cloneable {
    int version = 0;

    public OS(int version) throws InterruptedException {
        this.version = version;
        System.out.println("Building the OS v" + this.version + ".");
        Thread.sleep(5000);
        System.out.println("OS build finished.");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
