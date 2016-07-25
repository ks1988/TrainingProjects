package solid.demo_refactored.lsp_withinterface;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 10:28:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class Pool {

    public void run() {
        Duck donaldDuck = new Duck();
        ElectronicDuck electronicDuck = new ElectronicDuck();
        quack(donaldDuck, electronicDuck);
        swim(donaldDuck, electronicDuck);
    }

    private void quack(IDuck... ducks) {
        for (IDuck duck : ducks) {
            try {
                duck.quack();
            } catch (IDuck.IDuckException e) {
                e.printStackTrace();
            }
        }
    }

    private void swim(IDuck... ducks) {
        for (IDuck duck : ducks) {
            try {
                duck.swim();
            } catch (IDuck.IDuckException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}
