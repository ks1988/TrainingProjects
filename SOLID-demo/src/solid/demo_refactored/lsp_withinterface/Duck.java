package solid.demo_refactored.lsp_withinterface;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 10:24:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class Duck implements IDuck{

    public void quack() {
        System.out.println("Quack.....");
    }

    public void swim() {
        System.out.println("Swim....");
    }

}
