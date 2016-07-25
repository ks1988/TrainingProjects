package net.media.training;/**
 * Created by autoopt/mayank.k
 */

class Car extends Target {

    public Car(int health) {
        super(health);
    }

    @Override
    void hit() {
        health--;
    }
}
