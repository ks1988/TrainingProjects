package net.media.training.designpattern_refactored.builder;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 10:30:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class RootXmlBuilder extends XML {
    private String encoding;

    private String header() {
        return "<?xml version=\"1.0\" encoding=\"" + encoding + "\"?>";
    }

    @Override
    public String toString() {
        return header() + super.toString(); 
    }

    public void addEncodingHeader(String encoding) {
        this.encoding = encoding;
    }
}
