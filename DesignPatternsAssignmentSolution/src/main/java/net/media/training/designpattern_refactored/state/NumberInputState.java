package net.media.training.designpattern_refactored.state;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 5:41:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class NumberInputState extends State {

    public NumberInputState(Character c) {
        super(c.toString());
    }

    @Override
    protected void inputOperator(Character c) {
        next = new OperatorEnteredState(
                Integer.parseInt(display.toString()), c);
    }

    @Override
    protected void inputDigit(Character c) {
        display.append(c);
    }
}
