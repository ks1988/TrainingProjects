package net.media.training.designpattern_refactored.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 9:37:04 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class PhoneFactory {
    public abstract MotherBoard createMotherBoard();

    public abstract Processor createProcessor();

    public abstract Case createCase();

    public abstract Screen createScreen();
}
