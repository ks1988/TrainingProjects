package net.media.training.designpattern_refactored.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 2:24:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Length implements Validation {
    private int allowedLength;

    public Length(int allowedLength) {
        this.allowedLength = allowedLength;
    }

    public void validate(Object val) {
        if (((String) val).length() > allowedLength)
            throw new RuntimeException("Invalid length:" + allowedLength);
    }
}
