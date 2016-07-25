package solid.demo_refactored.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 11:05:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class IntegerComparison implements IComparison {
    public boolean compare(Object i1, Object i2) {
        return (((Integer) i1 > (Integer) i2));
    }
}
