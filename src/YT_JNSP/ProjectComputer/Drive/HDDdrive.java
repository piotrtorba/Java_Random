package YT_JNSP.ProjectComputer.Drive;

import YT_JNSP.ProjectComputer.File.File;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HDDdrive implements Drive {
    private List<File> files = new ArrayList<>();
    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void listFiles() {
        for (File file : files) {
        System.out.println(file.getName());
        }
    }

    @Override
    public File findFile(String name) {
        Optional<File> firstFound = files.stream()
                .filter(file -> file.getName().equals(name))
                .findFirst();

        return firstFound.orElseThrow();
    }
}
