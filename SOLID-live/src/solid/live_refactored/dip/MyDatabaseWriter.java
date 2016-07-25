package solid.live_refactored.dip;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 19, 2011
 * Time: 5:20:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyDatabaseWriter implements IWriter{
    public void write(String input) {
        MyDatabase database = new MyDatabase();
        database.write(input);
    }
}
