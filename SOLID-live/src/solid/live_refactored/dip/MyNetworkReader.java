package solid.live_refactored.dip;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 5:22:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyNetworkReader implements IReader {
    private String protocol;
    private String host;
    private String file;

    public MyNetworkReader(String protocol, String host, String file) {
        this.protocol = protocol;
        this.host = host;
        this.file = file;
    }

    public String read() {
        URL url = null;
        try {
            url = new URL(protocol, host, file);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        InputStream in = null;
        try {
            in = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString = new StringBuilder();
        try {
            int c;
            c = reader.read();
            while (c != -1) {
                inputString.append((char) c);
                c = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputString.toString();
    }
}
