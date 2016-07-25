package solid.live_refactored.lsp;

import java.util.LinkedHashSet;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 11:32:05 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractSet<T> {
    protected java.util.Set innerSet = new LinkedHashSet();

    public abstract boolean isMember(final T element);


    public int size() {
        return innerSet.size();
    }
}
