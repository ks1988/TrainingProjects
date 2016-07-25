package net.media.training;/**
 * Created by autoopt/mayank.k
 */

abstract class Target {
    int health;

    public Target(int health) {
        this.health = health;
    }

    abstract void hit();

    public boolean isDead() {
        return health == 0;
    }

    @Override
    public String toString() {
        return getClass().getName()+"{" +
                "health=" + health +
                '}';
    }
}
