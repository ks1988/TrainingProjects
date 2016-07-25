package net.media.training.designpattern_refactored.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 2:33:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class SeniorEmployee extends CompanyMember {
    private int setMaxBonus;

    public SeniorEmployee() {
        super(new Validations(new NotEmpty(), new Length(50)),
                new Validations(new NotEmpty(), new Length(50)),
                new Validations(new AtLeast(200), new AtMost(1000)),
                new AtLeast(60));
    }

    public void setMaxBonus(int setMaxBonus) {
        new AtLeast(1).validate(setMaxBonus);
        this.setMaxBonus = setMaxBonus;
    }
}
