package net.media.training.designpattern_refactored.adapter;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 21, 2011
 * Time: 5:16:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class FrontDoorRegister {
    private LeaveRecordAdapter leaveRecord;

    public FrontDoorRegister(LeaveRecordAdapter leaveRecord) {
        this.leaveRecord = leaveRecord;
    }

    public String getDisplayWallOfShame() {
        String name="";

        name = leaveRecord.getMostAbsentEmployee();
        return name+" has been the most absent employee, shame!" ;
    }
}
