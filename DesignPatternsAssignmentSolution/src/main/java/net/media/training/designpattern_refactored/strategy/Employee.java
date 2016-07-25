package net.media.training.designpattern_refactored.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 2:26:05 PM
 * To change this template use File | Settings | File Templates.
 */

public class Employee extends CompanyMember {
    private int maxAllowedLeaves;

    public Employee() {
        super(new Validations(new NotEmpty(), new Length(50)),
                new Validations(new NotEmpty(), new Length(50)),
                new Validations(new AtMost(1000), new AtLeast(1)),
                new AtLeast(0));
    }

    public void setMaxAllowedLeaves(int leaves) {
        new AtLeast(1).validate(leaves);
        this.maxAllowedLeaves = leaves;
    }

}
