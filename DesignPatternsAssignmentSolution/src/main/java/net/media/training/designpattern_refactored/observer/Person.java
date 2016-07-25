package net.media.training.designpattern_refactored.observer;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 9:35:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person extends Character {
    public Person(Sun sun) {
        super(sun);
    }

    public void draw() {
        System.out.println("Person");
    }
}
