package net.media.training.designpattern_refactored.template;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 7:59:51 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Ship {
    private final Screen screen;
    private final Game game;

    public Ship(Screen screen, Game game) {

        this.screen = screen;
        this.game = game;
    }

    public void onHit(int impact) {
        effectOnHealth(impact);

        Animation animation = null;

        if (dead()) {
            animation = getSinkAnimation();
            game.notifyShipLost(this);
        }
        else
        {
            animation = getExplodeAnimation();
        }

        animation.render(screen);
    }

    public abstract Animation getExplodeAnimation();
    public abstract Animation getSinkAnimation();
    public abstract boolean dead();
    public abstract void effectOnHealth(int impact);
}