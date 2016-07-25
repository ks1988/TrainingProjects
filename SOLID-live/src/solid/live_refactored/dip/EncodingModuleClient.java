package solid.live_refactored.dip;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule encodingModule  = new EncodingModule();
        IReader reader = new MyFileReader("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt");
        IWriter writer = new MyFileWriter("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt");
        encodingModule.encode(reader,writer);

        reader = new MyNetworkReader("http","myfirstappwith.appspot.com","index.html");
        writer = new MyDatabaseWriter();
        encodingModule.encode(reader,writer);
    }
}
