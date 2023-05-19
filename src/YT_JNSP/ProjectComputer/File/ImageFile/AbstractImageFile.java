package YT_JNSP.ProjectComputer.File.ImageFile;

import YT_JNSP.ProjectComputer.File.AbstractFile;
import YT_JNSP.ProjectComputer.File.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String name, int size) {
        super(name, size);
    }
    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
