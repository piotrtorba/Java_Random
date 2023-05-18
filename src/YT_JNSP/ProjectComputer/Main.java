package YT_JNSP.ProjectComputer;

import YT_JNSP.ProjectComputer.Drive.HDDdrive;
import YT_JNSP.ProjectComputer.Drive.SSDdrive;
import YT_JNSP.ProjectComputer.usbdevice.MemoryStick;
import YT_JNSP.ProjectComputer.usbdevice.Mouse;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------- Computer -----------------");
        // Shortes way to create new object 'Computer' with its' arguments (display & drive):
        // new Computer(new Display(), new HDDdrive());
        Display display = new Display();
        HDDdrive drive = new HDDdrive();
        //SSDdrive drive = new SSDdrive();
        Computer Desktop_1 = new Computer(display, drive);

        /*drive.addFile(new File("testFile.txt"));
        drive.listFiles();*/
        MemoryStick memoryStick = new MemoryStick("Pendrive");
        Mouse mouse = new Mouse("Myszka");

       Desktop_1.addUSBDevice(mouse);
       mouse.getName();

       Desktop_1.addUSBDevice(memoryStick);
       memoryStick.getName();

       Desktop_1.removerUSBDevice(mouse);
       memoryStick.eject();
       Desktop_1.removerUSBDevice(memoryStick);

    }
}
