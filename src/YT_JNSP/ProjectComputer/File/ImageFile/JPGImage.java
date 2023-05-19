package YT_JNSP.ProjectComputer.File.ImageFile;
public class JPGImage extends AbstractImageFile {
    private int compression;
    public JPGImage(String name, int size, int compression) {
        super(name, size);
        this.compression = compression;
    }

    public int getCompression() {
        return compression;
    }
    public void showImage() {
        System.out.println("Showing JPG image...");
    }
}
