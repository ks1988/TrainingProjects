package net.media.training.designpattern_refactored.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 10:28:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class GREEval extends Criteria {

    protected GREEval(Criteria nextCriteria) {
        super(nextCriteria);
    }

    @Override
    protected boolean performEvaluate(Application theApp) {
        System.out.println("GREEval called");

        return theApp.getGre()>=1500;  
    }

}
