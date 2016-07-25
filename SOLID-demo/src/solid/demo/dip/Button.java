package solid.demo.dip;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 8:37:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class Button {
    private Lamp lamp;
    private boolean state;

    public Button(Lamp lamp) {
        this.lamp = lamp;
    }

    public void detect() {
        boolean buttonOn = getPhysicalState();
        if (buttonOn)
            lamp.turnOn();
        else
            lamp.turnOff();
    }

    private boolean getPhysicalState() {
        state = !state;
        return !state;
    }
}
