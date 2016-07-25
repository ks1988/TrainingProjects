package net.media.training.designpattern_refactored.template;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 8:01:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Game {
    private final Screen screen;

    public Game(Screen screen) {
        this.screen = screen;
    }

    public void notifyShipLost(Ship ship) {
        String[] nameParts = ship.getClass().getName().split("\\.");
        screen.show(nameParts[nameParts.length - 1] + " lost.");
    }
}