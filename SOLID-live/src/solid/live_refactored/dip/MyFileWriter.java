package solid.live_refactored.dip;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 5:30:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyFileWriter implements IWriter {
    private String fileName;

    public MyFileWriter(String fileName) {
        this.fileName = fileName;
    }

    public void write(String encodedLine) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(encodedLine);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
