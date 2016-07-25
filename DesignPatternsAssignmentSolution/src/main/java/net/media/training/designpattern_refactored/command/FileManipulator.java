package net.media.training.designpattern_refactored.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 20, 2011
 * Time: 5:11:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class FileManipulator {
    public void perform(List<Command> commands) {
        List<Command> executedCommands = new ArrayList<Command>();
        try {
            for (Command command : commands) {
                command.execute();
                executedCommands.add(command);
            }
        } catch (Exception e) {
            for (int i = executedCommands.size() - 1; i >= 0; i--) {
                executedCommands.get(i).rollback();
            }
        }
    }
}
