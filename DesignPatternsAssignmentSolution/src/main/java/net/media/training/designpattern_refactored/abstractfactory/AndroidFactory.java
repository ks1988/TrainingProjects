package net.media.training.designpattern_refactored.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 9:34:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class AndroidFactory extends PhoneFactory {
    @Override
    public MotherBoard createMotherBoard() {
        return new AndroidMotherBoard();
    }

    @Override
    public Processor createProcessor() {
        return new AndroidProcessor();
    }

    @Override
    public Case createCase() {
        return new AndroidCase();
    }

    @Override
    public Screen createScreen() {
        return new AndroidScreen();
    }
}
