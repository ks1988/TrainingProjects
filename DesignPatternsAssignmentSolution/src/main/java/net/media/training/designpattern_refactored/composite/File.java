package net.media.training.designpattern_refactored.composite;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:04 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class File implements DirectoryEntry {
    private final String name;
    private int size;
    private Directory parent;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public boolean fileObjectExists(String name) {
        return name.equals(this.name);
    }

    public int getSize() {
        return size;
    }

    public void delete() {
        parent.removeEntry(this);
    }

    public boolean entryExists(String name, Class objectType) {
        return name.equals(this.name) && this.getClass() == objectType;

    }

}
