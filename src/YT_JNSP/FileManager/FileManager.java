package YT_JNSP.FileManager;

import java.io.File;
import java.util.Objects;
import java.util.stream.Stream;

public class FileManager {
    public void listFiles(String directory) {
        System.out.println("----------- Start -> List of files -----------");
        Stream.of(Objects.requireNonNull(new File(directory).listFiles())) //Generating a stream with files as objects
                .filter(File::isFile) //filter files only. Method .isFile
                .map(File::getName)  //Maps files into Strings to get files names
                .forEach(System.out::println);  //Printing out files names
    }
    public void sortFiles(String directory) {
        System.out.println("----------- Start -> Sorted list of files -----------");
        Stream.of(Objects.requireNonNull(new File(directory).listFiles())) //Generating a stream with files as objects
                .filter(File::isFile)
                .sorted((fileLow, fileHigh) -> Long.compare(fileHigh.length(), fileLow.length()))
                .forEach(file -> {
                    System.out.println(file.getName());
                    System.out.println(file.length());

                });
    }
}
