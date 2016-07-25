package net.media.training.designpattern_refactored.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 11:41:13 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Criteria {
    private Criteria nextCriteria ;

    protected Criteria() {
    }

    protected Criteria(Criteria nextCriteria) {
        this.nextCriteria = nextCriteria;
    }

    boolean evaluate(Application theApp) {
        boolean result = performEvaluate(theApp);
        if (nextCriteria == null)
            return result;
        else
            return
                    result && nextCriteria.evaluate(theApp);
    }

    protected abstract boolean performEvaluate(Application theApp);
}
