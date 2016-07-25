package net.media.training.designpattern_refactored.state;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 5:26:15 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class State {
    protected StringBuilder display;
    protected State next;
    private List<Character> operators = new ArrayList<Character>() {
        {
            add('+');
            add('-');
            add('*');
            add('/');
        }
    };

    public State(String display) {
        this.display = new StringBuilder(display);
    }

    public String display() {
        return display.toString();
    }

    public State next() {
        return next;
    }

    public boolean isDigit(Character c) {
        return c >= 48 && c <= 57;
    }

    public boolean shouldTransition() {
        return next != null;
    }

    public void input(Character c) {
        if (isDigit(c))
            inputDigit(c);
        if (c.equals('c'))
            inputClear();
        if (operators.contains(c))
            inputOperator(c);
        if (c.equals('='))
            inputEqualsOperator(c);
    }

    protected void inputClear() {
        next = new ClearState();
    }

    protected void inputEqualsOperator(Character c) {
    }

    protected void inputOperator(Character c) {
    }

    protected void inputDigit(Character c) {
    }

}
