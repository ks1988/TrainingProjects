package net.media.training.designpattern_refactored.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 2:24:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class NotEmpty implements Validation {

    public void validate(Object val) {
        if (val == null || ((String) val).length() == 0)
            throw new RuntimeException("not empty check failed for value:" + val);
    }
}
