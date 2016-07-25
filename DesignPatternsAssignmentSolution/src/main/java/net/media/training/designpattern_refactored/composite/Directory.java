package net.media.training.designpattern_refactored.composite;



import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:51 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class Directory implements DirectoryEntry {
    private final String name;
    private final List<DirectoryEntry> fileObjects;
    private Directory parent;

    public String getName() {
        return name;
    }

    public Directory(String name, List<DirectoryEntry> fileObjects) {
        this.name = name;
        this.fileObjects = fileObjects;

        for (DirectoryEntry fileObject : fileObjects) {
            fileObject.setParent(this);
        }
    }

    public int getSize() {
        int sum = 0;

        for (DirectoryEntry fileObject : fileObjects) {
            sum += fileObject.getSize();
        }

        return sum;
    }

    public void setParent(Directory directory) {
        this.parent = directory;
    }

    public void delete() {
        while (fileObjects.size() > 0)
            fileObjects.get(0).delete();
        parent.removeEntry(this);
    }

    public void removeEntry(DirectoryEntry fileObject) {
        fileObjects.remove(fileObject);
    }

    public boolean entryExists(String name, Class objectType) {
        if (this.name.equals(name) && getClass() == objectType) {
            return true;
        }

        for(DirectoryEntry fileObject : fileObjects) {
            if (fileObject.entryExists(name, objectType)) {
                return true;
            }
        }

        return false;
    }

}