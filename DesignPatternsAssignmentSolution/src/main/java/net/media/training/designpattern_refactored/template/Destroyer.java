package net.media.training.designpattern_refactored.template;

/**
* Created by IntelliJ IDEA.
* User: joelrosario
* Date: Jul 19, 2011
* Time: 8:14:23 PM
* To change this template use File | Settings | File Templates.
*/
public class Destroyer extends Ship {
    private float health = 100;
    private float reactorHealth = 10;

    public Destroyer(Screen screen, Game game) {
        super(screen, game);
    }

    @Override
    public Animation getExplodeAnimation() {
        return new ExplodeDestroyerAnimation();
    }

    @Override
    public Animation getSinkAnimation() {
        return new SinkDestroyerAnimation();
    }

    @Override
    public boolean dead() {
        return health <= 0 || reactorHealth <= 0;
    }

    @Override
    public void effectOnHealth(int impact) {
        health -= impact * 1.2;
        if (impact > 15)
            reactorHealth -= 1;
    }
}