package solid.demo.isp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 18, 2010
 * Time: 12:53:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Human implements Worker {
    public String work() {
        return "human works";
    }

    public String eat() {
        return "human eats";
    }
}
