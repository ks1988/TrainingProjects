package solid.demo_refactored.lsp;

import java.util.ArrayList;
import java.util.List;

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
        List<Duck> ducks = new ArrayList<Duck>();
        ducks.add(donaldDuck);
        ElectronicDuck electronicDuck = new ElectronicDuck();
        List<ElectronicDuck> electronicDucks = new ArrayList<ElectronicDuck>();
        electronicDucks.add(electronicDuck);
        quack(ducks, electronicDucks);
        swim(ducks, electronicDucks);
    }

    private void quack(List<Duck> ducks, List<ElectronicDuck> electronicDucks) {
        for (Duck duck : ducks) {
            duck.quack();
        }
        for (ElectronicDuck duck : electronicDucks) {
            duck.quack();
        }

    }
    private void swim(List<Duck> ducks, List<ElectronicDuck> electronicDucks)
    {
        for (Duck duck : ducks) {
            duck.swim();
        }
        for (ElectronicDuck duck : electronicDucks) {
            duck.swim();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }

}
