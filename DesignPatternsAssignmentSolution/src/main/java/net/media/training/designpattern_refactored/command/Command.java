package net.media.training.designpattern_refactored.command;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 20, 2011
 * Time: 5:06:23 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Command {
    private String status;

    public void rollback() {
        if (status != "done") return;
        performRollback();
        status = "rolledback";
    }

    protected abstract void performRollback();

    public void execute() {
        if (status == "done") return;
        performExecute();
        status = "done";
    }

    protected abstract void performExecute();
}
