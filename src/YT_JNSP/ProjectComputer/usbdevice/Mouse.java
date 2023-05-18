package YT_JNSP.ProjectComputer.usbdevice;

public class Mouse implements USBDevice{
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Mouse connected");
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Mouse disconnected");
        System.out.println("------------------");
        return true;
    }

    @Override
    public String getName() {
        System.out.println(">>>> The mouse type is: " + name);
        return name;
    }
}
