package net.media.training.designpattern_refactored.command;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 20, 2011
 * Time: 5:10:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class UpdateFile extends Command {
    private final String fileName;
    private final String newContent;
    private String oldContent = "";

    public UpdateFile(String fileName, String newContent) {
        this.fileName = fileName;
        this.newContent = newContent;
    }

    @Override
    public void performExecute() {
        File file = new File(fileName);
        if (!file.exists())
            throw new RuntimeException("File: " + this.fileName + " does not exist");
        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                oldContent += aLine;
            }
            reader.close();
            PrintWriter writer = new PrintWriter(file);
            writer.write(this.newContent);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void performRollback() {
        File file = new File(fileName);
        PrintWriter writer;
        try {
            writer = new PrintWriter(file);
            writer.write(oldContent);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
