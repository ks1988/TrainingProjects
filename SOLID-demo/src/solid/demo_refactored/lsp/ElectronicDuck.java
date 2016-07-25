package solid.demo_refactored.lsp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 10:25:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class ElectronicDuck {
    private boolean isTurnedOn = false;

    public void quack() {
        if (isTurnedOn)
            System.out.println("Electronic duck quack");
        else
            throw new RuntimeException("Cant quack when off");
    }

    public void swim() {
        if (isTurnedOn)
            System.out.println("Electronic duck swim");
        else
            throw new RuntimeException("Cant swim when off");
    }

    public void turnOn() {
        this.isTurnedOn = true;
    }

    public void turnOff() {
        this.isTurnedOn = false;
    }


}
