package solid.live_refactored.lsp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 12:52:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class Set<T> extends AbstractSet<T> {

    public void add(final T element) {
        innerSet.add(element);
    }

    @Override
    public boolean isMember(final T element) {
        return innerSet.contains(element);
    }
}
