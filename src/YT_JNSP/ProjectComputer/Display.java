package YT_JNSP.ProjectComputer;

public class Display {
    private int width = 3840;
    private int height = 1920;

    public void setMinRes() {
        width = 800;
        height = 600;
    }
    public void setMaxRes() {
        width = 3840;
        height = 1920;
    }
    public String getRes() {
        return width + " x " + height;
    }

}
