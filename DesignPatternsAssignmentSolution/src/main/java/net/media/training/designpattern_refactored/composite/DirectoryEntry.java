package net.media.training.designpattern_refactored.composite;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:56:51 PM
 * To change this template use File | Settings | File Templates.
 */
public interface DirectoryEntry {
    public int getSize();
    public void delete();
    void setParent(Directory directory);
    String getName();
    boolean entryExists(String name, Class objectType);
}
