package YT_JNSP.ProjectComputer.File.MusicFile;

import YT_JNSP.ProjectComputer.File.AbstractFile;
import YT_JNSP.ProjectComputer.File.FileType;

public class MP3File extends AbstractMusicFile {
    private int quality;
    public MP3File(String name, int size, String bandName, String title, int quality) {
        super(name, size, bandName, title);
        this.quality = quality;
    }
    @Override
    public void play() {
        System.out.println("Now playing MP3 file...");
    }
    public int getQuality() {
        return quality;
    }
}
