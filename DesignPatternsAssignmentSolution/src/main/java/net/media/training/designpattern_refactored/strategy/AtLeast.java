package net.media.training.designpattern_refactored.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 2:10:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class AtLeast implements Validation {
    private final int min;

    public AtLeast(int min) {
        this.min = min;
    }

    public void validate(Object name) {
        Integer val = (Integer) name;
        if (val < min)
            throw new RuntimeException("at least check failed:" + val);
    }
}
