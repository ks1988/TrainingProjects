package net.media.training.designpattern_refactored.command;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 20, 2011
 * Time: 5:10:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateFile extends Command {
    private final String fileName;
    private final String content;

    public CreateFile(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
    }

    @Override
    protected void performRollback() {
        File file = new File(fileName);
        file.delete();
    }

    @Override
    protected void performExecute() {
        File file = new File(fileName);
        if (file.exists())
            throw new RuntimeException("File already exist");
        try {
            file.createNewFile();
            PrintWriter writer = new PrintWriter(file);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
