package YT_JNSP.ProjectComputer.File.ImageFile;

public class GIFImage extends AbstractImageFile {
    public GIFImage(String name, int size) {
        super(name, size);
    }

    public void showAnimation() {
        System.out.println("Showing funny GIF image...");
    }
}
