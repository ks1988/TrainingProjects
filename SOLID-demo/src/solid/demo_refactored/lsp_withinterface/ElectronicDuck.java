package solid.demo_refactored.lsp_withinterface;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 10:25:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class ElectronicDuck implements IDuck {
    private boolean isTurnedOn = false;

    public void quack() throws DuckIsOffException {
        if (isTurnedOn)
            System.out.println("Electronic duck quack");
        else
            throw new DuckIsOffException("Cant quack when off");
    }

    public void swim() throws DuckIsOffException {
        if (isTurnedOn)
            System.out.println("Electronic duck swim");
        else
            throw new DuckIsOffException("Cant swim when off");
    }

    public void turnOn() {
        this.isTurnedOn = true;
    }

    public void turnOff() {
        this.isTurnedOn = false;
    }


    public static class DuckIsOffException extends IDuckException {
        public DuckIsOffException(String message) {
            super(message);
        }
    }

}
