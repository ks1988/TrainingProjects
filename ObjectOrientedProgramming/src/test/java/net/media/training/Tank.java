package net.media.training;/**
 * Created by autoopt/mayank.k
 */

class Tank extends Target {

    int armor;

    public Tank(int health, int armor) {
        super(health);
        this.armor = armor;
    }

    @Override
    void hit() {
        if (armor > 0) {
            armor--;
        } else {
            health--;
        }
    }
}
