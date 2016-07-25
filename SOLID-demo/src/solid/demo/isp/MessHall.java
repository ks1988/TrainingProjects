package solid.demo.isp;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 5:38:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class MessHall {
    private List<Worker> workers;

    public void manage() {
        for (Worker worker : workers) {
            worker.eat();
        }
    }

}
