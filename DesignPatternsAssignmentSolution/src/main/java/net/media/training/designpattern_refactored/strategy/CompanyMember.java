package net.media.training.designpattern_refactored.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:45:04 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CompanyMember {
    private String name;
    protected int monthsSpent;
    protected String mgrName;
    protected int salary;
    private Validation mgrNameValidation;
    private Validation nameValidation;
    private Validation salaryValidation;
    private Validation monthsSpentValidation;

    public CompanyMember(Validation nameValidation,
                         Validation mgrNameValidation,
                         Validation salaryValidation,
                         Validation monthsSpentValidation) {
        this.nameValidation = nameValidation;
        this.mgrNameValidation = mgrNameValidation;
        this.salaryValidation = salaryValidation;
        this.monthsSpentValidation = monthsSpentValidation;
    }

    public void setName(String name) {
        nameValidation.validate(name);
        this.name = name;
    }

    public void setManagerName(String mgrName) {
        mgrNameValidation.validate(mgrName);
        this.mgrName = mgrName;
    }

    public void setSalary(int salary) {
        salaryValidation.validate(salary);
        this.salary = salary;
    }

    public void setMonthsSpent(int monthsSpent) {
        monthsSpentValidation.validate(monthsSpent);
        this.monthsSpent = monthsSpent;
    }
}
