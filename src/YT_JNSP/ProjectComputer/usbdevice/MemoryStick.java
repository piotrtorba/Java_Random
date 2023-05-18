package YT_JNSP.ProjectComputer.usbdevice;

public class MemoryStick implements USBDevice{
    private String name;
    private boolean ejected = false;
    public MemoryStick(String name) {
        this.name = name;
    }
    @Override
    public boolean connect() {
        System.out.println("Memory Stick connected.");
        return true;
    }

    @Override
    public boolean disconnect() {
        if (!ejected) {
            System.out.println("TIP: Please eject the Memory Stick first!");
            return false;
        } else {
            System.out.println("Memory Stick safely disconnected.");
            System.out.println("---------------------------------");
            return true;
        }
    }
    public void eject() {
        ejected = true;
    }

    @Override
    public String getName() {
        System.out.println(">>>> Memory Stick type is: " + name);
        return name;
    }
}
