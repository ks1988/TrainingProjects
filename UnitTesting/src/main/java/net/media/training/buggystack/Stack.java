package net.media.training.buggystack;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 9:13:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class Stack<T> {
    private Object[] list;
    private int TOP = -1;
    private int maxSize;

    public Stack(int maxSize) {
        list = new Object[maxSize];
        this.maxSize = maxSize;
    }

    public int size() {
        return TOP + 1;
    }

    public void push(T element) {
        checkOverFlow();
        list[++TOP] = element;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        checkUnderFlow();
        T element = (T) list[TOP];
        list[TOP] = null;
        TOP--;
        return element;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        checkUnderFlow();
        return (T) list[TOP];
    }

    public boolean exist(T element) {
        if (element == null)
            return false;
        else
            for (Object item : list) {
                if (element.equals(item))
                    return true;
            }
        return false;
    }

    private void checkOverFlow() {
        if (size() == maxSize)
            throw new StackOverFlowException();
    }

    private void checkUnderFlow() {
        if (size() == 0)
            throw new StackUnderOverFlowException();
    }
}
