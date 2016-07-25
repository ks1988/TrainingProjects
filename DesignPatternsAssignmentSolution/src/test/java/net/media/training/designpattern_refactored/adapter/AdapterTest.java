package net.media.training.designpattern_refactored.adapter;

import net.media.training.designpattern_refactored.adapter.thirdparty.ThirdPartyLeaveRecord;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 21, 2011
 * Time: 5:40:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class AdapterTest {
    @Test
    public void testGetDisplayWallOfShame() throws Exception {
        FrontDoorRegister frontDoorRegister = new FrontDoorRegister(new LeaveRecordAdapter(new ThirdPartyLeaveRecord()));
        assertEquals("Super Commando Dhruv has been the most absent employee, shame!", frontDoorRegister.getDisplayWallOfShame());
    }

    @Test
    public void salaryDisbersmentTest() {
      SalaryDisberser salaryDisberser = new SalaryDisberser(new LeaveRecordAdapter(new ThirdPartyLeaveRecord()));
      assertEquals(10000, salaryDisberser.salary("James Bond"));
      assertEquals(8000, salaryDisberser.salary("Austin Powers"));
      assertEquals(5000, salaryDisberser.salary("Super Commando Dhruv"));
    }
}
