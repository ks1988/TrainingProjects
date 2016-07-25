package solid.demo.isp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 18, 2010
 * Time: 12:54:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Robot implements Worker {
    public String work() {
        return "Robot works";
    }
    public String eat() {
      throw new RuntimeException("Robot can't eat");
    }
}
