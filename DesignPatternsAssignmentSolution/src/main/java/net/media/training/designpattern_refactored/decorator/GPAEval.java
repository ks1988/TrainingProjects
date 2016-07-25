package net.media.training.designpattern_refactored.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 10:26:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class GPAEval extends Criteria {

    protected GPAEval(Criteria nextCriteria) {
        super(nextCriteria);
    }

    public boolean performEvaluate(Application theApp) {
        System.out.println("GPAEval called");
        return theApp.getGpa() > 8;
    }
}
