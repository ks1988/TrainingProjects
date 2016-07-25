package solid.demo_refactored.dip;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 8:37:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class Fan implements Equipment{
    public void turnOn() {
        System.out.println("Fan turned on. Yupeeeee:), it's too hot");
    }

    public void turnOff() {
        System.out.println("Fan turned off. :(:( why did you tunred fan off?, its too hot");
    }
}
