package net.media.training.designpattern_refactored.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 10:41:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class TOEFL extends Criteria {

    public TOEFL() {
    }

    protected TOEFL(Criteria nextCriteria) {
        super(nextCriteria);
    }

    @Override
    public boolean performEvaluate(Application theApp) {
        return theApp.getToefl() > 100;
    }
}
