package net.media.training.designpattern_refactored.adapter;

import net.media.training.designpattern_refactored.adapter.thirdparty.ThirdPartyLeaveRecord;


/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 21, 2011
 * Time: 5:41:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class LeaveRecordAdapter {
    private final ThirdPartyLeaveRecord thirdPartyLeaveRecord;

    public LeaveRecordAdapter(ThirdPartyLeaveRecord thirdPartyLeaveRecord) {

        this.thirdPartyLeaveRecord = thirdPartyLeaveRecord;
    }

    public String getMostAbsentEmployee() {
        String nameParts[] = thirdPartyLeaveRecord.getMostAbsentEmployee().getName().split(",");
        return nameParts[1].trim() + " " + nameParts[0].trim();
    }

    public int getEmployeeAbsences(String employeeName) {
        int lastIndex = employeeName.lastIndexOf(" ");
        String firstPart =  employeeName.substring(lastIndex+1) ;
        String secondPart = employeeName.substring(0,lastIndex);
        return thirdPartyLeaveRecord.getEmployeeAbsences(new Employee(firstPart+", " + secondPart));
    }
}
