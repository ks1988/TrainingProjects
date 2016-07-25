package solid.live_refactored.srp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 20, 2011
 * Time: 1:56:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee {
    private int empId;
    private static int TOTAL_LEAVES_ALLOWED = 30;

    private double monthlySalary;
    private String name;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;
    private String manager;
    private int leavesTaken;
    private int yearsInOrg;
    private int[] leavesLeftPreviously;

    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public int empId() {
        return empId;
    }

    public String name() {
        return name;
    }

    public int leaveLeft() {
        return TOTAL_LEAVES_ALLOWED - leavesTaken;
    }

    public long annualSalary() {
        return Math.round(monthlySalary * 12);
    }

    public String manager() {
        return manager;
    }

    public int totalLeaveLeftPreviously() {
        int years = (yearsInOrg < 3) ? yearsInOrg : 3;
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += leavesLeftPreviously[yearsInOrg - i-1];
        }
        return totalLeaveLeftPreviously;
    }
}
