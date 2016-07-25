package solid.demo_refactored.dip;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 8:34:59 AM
 * To change this template use File | Settings | File Templates.
 */
public class Lamp implements Equipment {
    public void turnOn() {
        System.out.println("Lamp turned on");
    }

    public void turnOff() {
        System.out.println("Lamp turned off");
    }
}
