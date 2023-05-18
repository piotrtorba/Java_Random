package YT_JNSP.ProjectComputer;

import YT_JNSP.ProjectComputer.Drive.Drive;
import YT_JNSP.ProjectComputer.usbdevice.USBDevice;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class Computer {
    private Display display;
    private Drive drive;
    private Speakers speakers;
    private List<USBDevice> usbDevices = new ArrayList<>();

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

    public List<USBDevice> getUsbDevice() {
        return usbDevices;
    }

    public void addUSBDevice(USBDevice usbDevice1) {
        boolean isConnected = usbDevice1.connect();
        if (isConnected) {
            usbDevices.add(usbDevice1);
        }
    }
    public void removerUSBDevice(USBDevice usbDevice) {
        boolean isDisconnected = usbDevice.disconnect();
        if (isDisconnected) {
            usbDevices.remove(usbDevice);
        }
    }
}
