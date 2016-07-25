package net.media.training.designpattern_refactored.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 10:02:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class XML {
    private HashMap<String, String> attrs;
    private List<Object> nodes;
    private String root;

    public XML() {
        attrs = new HashMap<String, String>();
        nodes = new ArrayList<Object>();
    }

    public void attr(String key, String value) {
        attrs.put(key, value);
    }

    public void c(String name, XML builder) {
        builder.addRoot(name);
        nodes.add(builder);
    }

    public void c(String name, final String content) {
        c(name, new XML() {{
            addText(content);
        }});
    }

    public void addText(String text) {
        nodes.add(text);
    }

    protected String children() {
        String childString = "";
        for (Object node : nodes) {

            childString += (node instanceof String) ? (String) node : child((XML) node);
        }
        return childString;
    }

    private String child(XML builder) {
        return builder.toString();
    }

    protected String attributes() {
        String attr = "";
        for (String key : attrs.keySet()) {
            attr += " " + key + "=\"" + attrs.get(key) + "\"";
        }
        return attr;
    }

    public void addRoot(String root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return "<" + root + attributes() + ">" +
                children() + "</" + root + ">";
    }
}
