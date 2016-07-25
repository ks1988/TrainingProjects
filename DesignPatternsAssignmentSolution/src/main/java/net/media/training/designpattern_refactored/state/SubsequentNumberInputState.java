package net.media.training.designpattern_refactored.state;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 5:54:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class SubsequentNumberInputState extends State {
    private Integer currentValue;
    private Character currentOperator;

    public SubsequentNumberInputState(Integer currentValue, Character currentOperator, Character c) {
        super(c.toString());
        this.currentValue = currentValue;
        this.currentOperator = currentOperator;
    }

    public Integer operate(Integer newValue) {
        switch (currentOperator) {
            case '+':
                return currentValue + newValue;
            case '-':
                return currentValue - newValue;
            case '*':
                return currentValue * newValue;
            case '/':
                return currentValue / newValue;
        }
        throw new RuntimeException("Invalid operator");
    }

    @Override
    protected void inputEqualsOperator(Character c) {
        next = new EqualToState(operate(Integer.parseInt(display.toString())));
    }

    @Override
    protected void inputOperator(Character c) {
        next = new OperatorEnteredState(operate(Integer.parseInt(display.toString())), c);
    }

    @Override
    protected void inputDigit(Character c) {
        display.append(c);
    }

}
