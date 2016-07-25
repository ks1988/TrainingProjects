package solid.live_refactored.srp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 2:49:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeFormatter {
    private Employee employee;

    public EmployeeFormatter(Employee employee) {
        this.employee = employee;
    }

    public String toHtml() {
        return "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee.empId() + "'>" +
                "<span>" + employee.name() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>" +
        "<div class='right'><span>" + employee.leaveLeft() + "</span>" +
        "<span>" + employee.annualSalary() + "</span>" +
        "<span>" + Manager() + "</span>" +
        "<span>" + employee.totalLeaveLeftPreviously() + "</span>" +
        "</div> </div>";
    }

    private String Manager() {
        return (employee.manager() != null) ? employee.manager() : "None";
    }
}

