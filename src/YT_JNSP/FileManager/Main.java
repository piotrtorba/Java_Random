package YT_JNSP.FileManager;

public class Main {
    public static void main(String[] args) {
        FileManager fm = new FileManager();
        fm.listFiles("/home/popo/Documents/code");
        fm.sortFiles("/home/popo/Documents/code");
    }
}
