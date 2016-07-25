package solid.demo_refactored.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 3:47:55 PM
 * To change this template use File | Settings | File Templates.
 */

public class ListClient {

    public static void main(String[] args) {
        MyList integerElements = new MyList();
        integerElements.add(2);
        integerElements.add(1);
        integerElements.add(3);

        integerElements.sort(new IntegerComparison());

        MyList stringElements = new MyList();
        stringElements.add("a");
        stringElements.add("ccc");
        stringElements.add("zz");

        stringElements.sort(new StringLengthComparison());

        System.out.println("integerElements: " + integerElements);
        System.out.println("stringElements: " + stringElements);
    }
}
