package solid.live_refactored.dip;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 5:20:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyFileReader implements IReader {
    private String fileName;

    public MyFileReader(String fileName) {
        this.fileName = fileName;
    }

    public String read() {
        StringBuilder lines = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                lines.append(aLine);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines.toString();
    }
}
