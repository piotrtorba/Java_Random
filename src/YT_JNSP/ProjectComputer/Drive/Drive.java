package YT_JNSP.ProjectComputer.Drive;

import YT_JNSP.ProjectComputer.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
