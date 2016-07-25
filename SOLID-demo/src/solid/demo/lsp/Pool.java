package solid.demo.lsp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 10:28:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class Pool {

    public void run()
    {
        Duck donaldDuck  = new Duck();
        Duck electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(Duck ...ducks) {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }
    private void swim(Duck ...ducks) {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }

}
