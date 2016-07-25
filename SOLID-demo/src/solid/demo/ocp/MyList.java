package solid.demo.ocp;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 3:38:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyList<T> {
    private final java.util.List elements = new ArrayList();

    public void add(T element) {
        elements.add(element);
    }

    public void sort(int type) {
        int i, j;
        int length = elements.size();
        boolean swapOrNot = false;
        for (i = 0; i < length; i++) {
            for (j = 1; j < (length - i); j++) {
                switch (type) {
                    case 1:
                        if ((Integer) elements.get(j - 1) > (Integer) elements.get(j)) {
                            swapOrNot = true;
                        }
                        break;
                    case 2:
                        if (((String) elements.get(j - 1)).length() > ((String) elements.get(j)).length()) {
                            swapOrNot = true;
                        }
                        break;
                }
                if (swapOrNot) {
                    swap(elements, j);
                    swapOrNot = false;
                }
            }
        }
    }

    private void swap(java.util.List a, int j) {
        //swap elements at index j and j-1
        Object t = a.get(j - 1);
        a.set(j - 1, a.get(j));
        a.set(j, t);
    }

    @Override
    public String toString() {
        return "List{" +
                "elements=" + elements +
                '}';
    }
}
