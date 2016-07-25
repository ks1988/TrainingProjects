package net.media.training.designpattern_refactored.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 2:17:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class Validations implements Validation {
    private final Validation[] validations;

    public Validations(Validation ...validations) {
        this.validations = validations;
    }

    public void validate(Object val) {
        for (Validation validation : validations) {
            validation.validate(val);
        }
    }
}
