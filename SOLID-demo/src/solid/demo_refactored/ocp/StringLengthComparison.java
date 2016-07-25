package solid.demo_refactored.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 11:09:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class StringLengthComparison implements IComparison {
    public boolean compare(Object i1, Object i2) {
        return (((String) i1).length() > ((String) i2).length());
    }
}
