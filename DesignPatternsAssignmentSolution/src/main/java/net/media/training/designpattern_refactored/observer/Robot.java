package net.media.training.designpattern_refactored.observer;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 21, 2011
 * Time: 10:23:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class Robot extends Character {
    public Robot(Sun sun) {
        super(sun);
    }

    @Override
    public void draw() {
        System.out.println("Robot");
    }
}
