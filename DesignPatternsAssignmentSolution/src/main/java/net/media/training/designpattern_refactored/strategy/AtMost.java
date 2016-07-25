package net.media.training.designpattern_refactored.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 2:22:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class AtMost implements Validation {
    private final int max;

    public AtMost(int max) {
        this.max = max;
    }

    public void validate(Object name) {
        Integer val = (Integer) name;
        if (val > max)
            throw new RuntimeException("at most check failed:" + val);
    }
}
