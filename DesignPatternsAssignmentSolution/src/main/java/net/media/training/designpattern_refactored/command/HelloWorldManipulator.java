package net.media.training.designpattern_refactored.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 20, 2011
 * Time: 5:04:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldManipulator {
    public void fixManipulate(final String fileName, final String newPath) {
        new FileManipulator().perform(
                foo(fileName, newPath)
        );
    }

    private List<Command> foo(final String fileName, final String newPath) {
        List<Command> l = new ArrayList<Command>();
        l.add(new CreateFile(fileName, "hello world"));
        l.add(new UpdateFile(fileName, "new hello world"));
        l.add(new MoveFile(fileName, newPath));
        return l;
    }

    public void brokenManipulate(final String fileName, final String newPath) {
        new FileManipulator().perform(
                new ArrayList<Command>() {
                    {
                        add(new CreateFile(fileName, "hello world"));
                        add(new UpdateFile(fileName, "new hello world"));
                        add(new MoveFile(fileName, newPath));
                        add(new CreateFile(fileName, "hello world"));
                        add(new CreateFile(fileName, "hello world"));
                    }
                }
        );
    }

}
