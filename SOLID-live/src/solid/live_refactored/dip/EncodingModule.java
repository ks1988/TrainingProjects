package solid.live_refactored.dip;


import net.iharder.Base64;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModule {
    public void encode(IReader reader, IWriter writer) {
        String aLine = reader.read();
        String encodedLine = Base64.encodeBytes(aLine.getBytes());
        writer.write(encodedLine);
    }
}

