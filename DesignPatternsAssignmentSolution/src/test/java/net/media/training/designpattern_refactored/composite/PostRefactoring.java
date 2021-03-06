package net.media.training.designpattern_refactored.composite;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 10:09:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class PostRefactoring {
    @Test
    public void BasicStuffWorks() {
        List<DirectoryEntry> fileObjects = new ArrayList();

        fileObjects.add(new File("file1", 10));
        fileObjects.add(new File("file2", 10));
        fileObjects.add(new File("File3", 10));

        List<DirectoryEntry> directories = new ArrayList();
        Directory dataDir = new Directory("data", fileObjects);
        
        directories.add(dataDir);

        Directory src = new Directory("src", directories);
        assertEquals("Size should be 30.", 30, src.getSize());

        assertTrue("File file1 should exist.", src.entryExists("file1", File.class));
        assertTrue("Directory data should exist.", src.entryExists("data", Directory.class));
        assertTrue("Directory src should exist.", src.entryExists("src", Directory.class));

        dataDir.delete();

        assertFalse("File file1 should not exist.", src.entryExists("file1", File.class));
        assertFalse("Directory data should not exist.", src.entryExists("data", Directory.class));
    }
}
