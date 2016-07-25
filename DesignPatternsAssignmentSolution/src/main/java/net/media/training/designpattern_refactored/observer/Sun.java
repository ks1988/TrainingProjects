package net.media.training.designpattern_refactored.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 9:12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sun {
    private boolean isUp;
    private List<ISunSubscriber> subscribers = new ArrayList();

    public boolean isUp() {
        return isUp;
    }

    public void set() {
        isUp = false;

        for (ISunSubscriber subscriber : subscribers) {
            try {
                subscriber.notifySunSet();
            }
            catch(RuntimeException e)
            {
                System.out.println(e.fillInStackTrace());
            }
        }
    }

    public void rise() {
        isUp = true;

        for (ISunSubscriber subscriber : subscribers) {
            try {
                subscriber.notifySunRose();
            }
            catch(RuntimeException e)
            {
                System.out.println(e.fillInStackTrace());
            }
        }
    }

    public void subscribe(ISunSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(ISunSubscriber subscriber) {
        subscribers.remove(subscriber);
    }
}
