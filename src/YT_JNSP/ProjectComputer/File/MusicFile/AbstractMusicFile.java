package YT_JNSP.ProjectComputer.File.MusicFile;

import YT_JNSP.ProjectComputer.File.AbstractFile;
import YT_JNSP.ProjectComputer.File.FileType;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile {
    protected String bandName;
    protected String title;

    protected AbstractMusicFile(String name, int size, String bandName, String title) {
        super(name, size);
        this.bandName = bandName;
        this.title = title;
    }

    @Override
    public FileType getType() {
        return FileType.MUSIC;
    }
}
