package net.media.training.designpattern_refactored.state;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 5:20:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {

    private State state;

    public String getDisplay() {
        return state.display();
    }

    public Calculator() {
        state = new ClearState();
    }

    public void input(Character c) {
        state.input(c);
        if (state.shouldTransition())
            state = state.next();
    }
}
