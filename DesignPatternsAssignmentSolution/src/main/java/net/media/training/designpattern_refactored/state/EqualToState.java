package net.media.training.designpattern_refactored.state;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:03:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class EqualToState extends State {

    public EqualToState(Integer value) {
        super(value.toString());
    }

}
