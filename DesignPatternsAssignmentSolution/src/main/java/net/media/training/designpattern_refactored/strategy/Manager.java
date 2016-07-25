package net.media.training.designpattern_refactored.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 2:27:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Manager extends CompanyMember {
    private String managementBand;

    public Manager() {
        super(new Validations(new NotEmpty(), new Length(50)),
                new Length(50),
                new AtLeast(1),
                new AtLeast(0));
    }

    public void setManagementBand(String managementBand) {
        new NotEmpty().validate(managementBand);
        this.managementBand = managementBand;
    }
}
