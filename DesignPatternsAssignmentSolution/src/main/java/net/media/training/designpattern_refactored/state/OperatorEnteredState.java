package net.media.training.designpattern_refactored.state;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 5:48:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class OperatorEnteredState extends State {
    private Integer currentValue;
    private Character currentOperator;

    public OperatorEnteredState(Integer currentValue, Character currentOperator) {
        super(currentValue.toString());
        this.currentValue = currentValue;
        this.currentOperator = currentOperator;
    }
    @Override
    protected void inputEqualsOperator(Character c) {
        next  = new ErrorState();
    }
    @Override
    protected void inputOperator(Character c) {
        next = new ErrorState();
    }
    @Override
    protected void inputDigit(Character c) {
        next = new SubsequentNumberInputState(
                currentValue,currentOperator, c);
    }
}
