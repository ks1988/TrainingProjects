package net.media.training.designpattern_refactored.observer;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 21, 2011
 * Time: 10:22:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class Dog extends Character {
    public Dog(Sun sun) {
        super(sun);
    }

    @Override
    public void draw() {
        System.out.println("Dog");
    }
}
