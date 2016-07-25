package solid.demo_refactored.lsp_withinterface;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 10:44:33 AM
 * To change this template use File | Settings | File Templates.
 */
public interface IDuck {
    void quack()  throws IDuckException;

    void swim() throws IDuckException;

    public static class IDuckException extends Exception {
        public IDuckException(String message) {
            super(message);
        }
    }
}
