package YT_JNSP.ProjectComputer;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Display display;
    private Drive drive;
    private Speakers speakers;
    List<USBdevice> usbDevice = new ArrayList<>();

    public Computer(Display display, Drive drive) {
        this.display = display;
        this.drive = drive;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public List<USBdevice> getUsbDevice() {
        return usbDevice;
    }
}
