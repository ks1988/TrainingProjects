package net.media.training.designpattern_refactored.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2012
 * Time: 1:36:57 PM
 * To change this template use File | Settings | File Templates.
 */

public class AlternateBuilder {
    Node node;

    public AlternateBuilder(String root, String encoding) {
        node = new RootNode(root, encoding);
    }

    public AlternateBuilder a(String name, Object value) {
        node.attr(name, value);
        return this;
    }

    public AlternateBuilder c(String childElementName) {
        node = new Node(childElementName, node);
        return this;
    }

    public AlternateBuilder t(String text) {
        node.addChild(text);
        return this;
    }

    public AlternateBuilder up() {
        if (node.parent != null)
            node = node.parent;
        return this;
    }

    public AlternateBuilder root() {
        while (node.parent != null)
            node = node.parent;
        return this;
    }

    public String toString() {
        this.root();
        return node.toString();
    }

    private class Node {
        private String name;
        Node parent;
        List<Object> children;
        Map<String, String> attributes;

        Node(String name, Node parent) {
            this.name = name;
            this.parent = parent;
            attributes = new HashMap<String, String>();
            children = new ArrayList<Object>();
            if (parent != null)
                parent.addChild(this);
        }

        private void addChild(Node node) {
            children.add(node);
        }

        public void addChild(String text) {
           children.add(text);
        }

        protected String attributeString() {
            String attr = "";
            for (String key : attributes.keySet()) {
                attr += " " + key + "=\"" + attributes.get(key) + "\"";
            }
            return attr;
        }

        public void attr(String name, Object value) {
            this.attributes.put(name, value.toString());
        }

        public String toString() {
            return "<" + name + attributeString() + ">" +
                    childrenString() + "</" + name + ">";
        }

        private String childrenString() {
            String childString = "";
            for (Object node : children) {
                childString += node.toString();
            }
            return childString;
        }
    }

    private class RootNode extends Node {
        private String encoding;

        RootNode(String name, String encoding) {
            super(name, null);
            this.encoding = encoding;
        }

        private String header() {
            return "<?xml version=\"1.0\" encoding=\"" + encoding + "\"?>";
        }

        @Override
        public String toString() {
            return header() + super.toString();
        }
    }


}
