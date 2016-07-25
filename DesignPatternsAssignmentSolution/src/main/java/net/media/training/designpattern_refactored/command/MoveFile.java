package net.media.training.designpattern_refactored.command;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 20, 2011
 * Time: 5:10:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class MoveFile extends Command {
    private final String oldPath;
    private final String newPath;

    public MoveFile(String oldPath, String newPath) {
        this.oldPath = oldPath;
        this.newPath = newPath;
    }

    @Override
    public void performRollback() {
        move(newPath, oldPath);
    }

    @Override
    public void performExecute() {
        move(oldPath, newPath);
    }

    private void move(final String source, final String destination) {
        File file = new File(source);
        if (!file.exists())
            throw new RuntimeException("File: " + this.oldPath + " does not exist");
        if (!file.renameTo(new File(destination)))
            throw new RuntimeException("Rename failed");
    }
}
