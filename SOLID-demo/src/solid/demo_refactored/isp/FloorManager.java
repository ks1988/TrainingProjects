package solid.demo_refactored.isp;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 5:36:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class FloorManager {
    private List<IWorker> workers ;

       public void manage()
       {
           for (IWorker worker : workers) {
               worker.work();
           }
       }

}
