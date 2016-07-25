package net.media.training.designpattern_refactored.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 9:35:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class IphoneFactory extends PhoneFactory {
    @Override
    public MotherBoard createMotherBoard() {
        return new IphoneMotherBoard();
    }

    @Override
    public Processor createProcessor() {
        return new IphoneProcessor();
    }

    @Override
    public Case createCase() {
        return new IphoneCase();
    }

    @Override
    public Screen createScreen() {
        return new IphoneScreen();
    }
}
