package net.media.training.designpattern_refactored.template;

/**
* Created by IntelliJ IDEA.
* User: joelrosario
* Date: Jul 19, 2011
* Time: 8:19:22 PM
* To change this template use File | Settings | File Templates.
*/
public class Frigate extends Ship {
    private int engineHealth = 5;
    private int health = 100;
    private int armor = 5;

    public Frigate(Screen screen, Game game) {
        super(screen, game);
    }

    @Override
    public Animation getExplodeAnimation() {
        return new ExplodeFrigateAnimation();
    }

    @Override
    public Animation getSinkAnimation() {
        return new SinkFrigateAnimation();
    }

    @Override
    public boolean dead() {
        return health <= 0 || engineHealth <= 0;
    }

    @Override
    public void effectOnHealth(int impact) {
        health -= (armor > 0 ? 1 : impact * 2.5);
        if (impact > 5 && armor <= 0)
            engineHealth -= 1;
        if (armor > 0)
            armor -= 1;
    }
}