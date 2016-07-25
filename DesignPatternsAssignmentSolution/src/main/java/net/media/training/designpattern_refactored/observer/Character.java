package net.media.training.designpattern_refactored.observer;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 21, 2011
 * Time: 10:19:36 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Character implements ISunSubscriber {
    private boolean feelingWarm;
    private Sun sun;
    private boolean feelingTired;
    private boolean outDoors = false;

    public Character(Sun sun) {
        this.sun = sun;
    }

    public void setSun(Sun sun) {
        this.sun = sun;
    }

    public void notifySunRose() {
        feelingWarm = true;
    }

    public void notifySunSet() {
        feelingWarm = false;
        feelingTired = true;
    }

    public boolean isFeelingWarm() {
        return feelingWarm;
    }

    public void goOutdoors() {
        outDoors = true;
        sun.subscribe(this);
        if (sun.isUp())
            feelingWarm = true;
    }

    public void goIndoors() {
        outDoors = false;
        sun.unsubscribe(this);
        if(!sun.isUp())
            feelingWarm = false;
    }

    public boolean isOutdoors() {
        return outDoors;
    }

    public boolean isFeelingTired() {
        return feelingTired;
    }

    public abstract void draw();
}
