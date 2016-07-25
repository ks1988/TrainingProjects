package net.media.training.designpattern_refactored.state;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 5:27:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClearState extends State {

    public ClearState() {
        super("");
    }

    @Override
    protected void inputOperator(Character c) {
        next = new ErrorState();
    }

    @Override
    protected void inputDigit(Character c) {
        next = new NumberInputState(c);
    }

}
