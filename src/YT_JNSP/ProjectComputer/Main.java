package YT_JNSP.ProjectComputer;

import YT_JNSP.ProjectComputer.Drive.HDDdrive;
import YT_JNSP.ProjectComputer.Drive.SSDdrive;
import YT_JNSP.ProjectComputer.File.File;
import YT_JNSP.ProjectComputer.File.ImageFile.GIFImage;
import YT_JNSP.ProjectComputer.File.ImageFile.JPGImage;
import YT_JNSP.ProjectComputer.File.MusicFile.MP3File;
import YT_JNSP.ProjectComputer.usbdevice.MemoryStick;
import YT_JNSP.ProjectComputer.usbdevice.Mouse;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------- Computer -----------------");
        // Shortes way to create new object 'Computer' with its' arguments (display & drive):
        // new Computer(new Display(), new HDDdrive());
        Display display = new Display();
        //HDDdrive drive = new HDDdrive();
        SSDdrive drive = new SSDdrive();
        Computer Desktop_1 = new Computer(display, drive);

        /*drive.addFile(new File("testFile.txt"));
        drive.listFiles();*/
        MemoryStick memoryStick = new MemoryStick("SanDisc - Pendrive");
        Mouse mouse = new Mouse("Logitech - Mouse");

       Desktop_1.addUSBDevice(mouse);
       mouse.getName();

       Desktop_1.addUSBDevice(memoryStick);
       memoryStick.getName();

       /*Desktop_1.removerUSBDevice(mouse);
       memoryStick.eject();
       Desktop_1.removerUSBDevice(memoryStick);*/

        GIFImage gifImage1 = new GIFImage("nazwa.gif", 100);
        JPGImage jpgImage1 = new JPGImage("nazwa.jpg", 255, 11);
        MP3File mp3File1 = new MP3File("nazwa.mp3", 133, "ACDC", "Thunder Strom", 100);

        drive.addFile(gifImage1);
        drive.addFile(jpgImage1);
        drive.addFile(mp3File1);
        drive.listFiles();
        File file = drive.findFile("mp3File1");
        System.out.println(file.getSize());

        /*gifImage1.getName();
        gifImage1.getSize();
        gifImage1.getType();
        gifImage1.showAnimation();*/
        System.out.println("------------------------------------");
    }
}
