package solid.demo_refactored.dip;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 8:35:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class Button {
    private boolean state;
    private Equipment equipment;

    public Button(Equipment equipment) {
        this.equipment  = equipment;
    }

    public void detect() {
        boolean buttonOn = getPhysicalState();
        if (buttonOn)
            equipment.turnOn();
        else
            equipment.turnOff();
    }

    private boolean getPhysicalState() {
        state = !state;
        return !state;
    }

}
