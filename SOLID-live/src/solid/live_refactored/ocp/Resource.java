package solid.live_refactored.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 2:30:17 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Resource {
    public int findFree();
    public void markBusy(int resourceId);
    public void markFree(int resourceId);
}
