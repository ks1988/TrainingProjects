package net.media.training.designpattern_refactored.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:34:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneMaker {

    public Case buildPhone(PhoneFactory factory) {
        Case phoneCase = factory.createCase();
        phoneCase.attachMotherBoard(setupMotherBoard(factory));
        phoneCase.attachScreen(factory.createScreen());
        return phoneCase;
    }

    private MotherBoard setupMotherBoard(PhoneFactory factory) {
        MotherBoard motherBoard = factory.createMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(factory.createProcessor());
        return motherBoard;
    }
}
