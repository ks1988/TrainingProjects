package net.media.training.designpattern_refactored.template;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 8:25:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class TemplateTest {
    @Test
    public void BasicStuffWorks() {
        Screen screen = new Screen();
        Game game = new Game(screen);

        Frigate frigate = new Frigate(screen, game);
        Destroyer destroyer = new Destroyer(screen, game);

        frigate.onHit(50);
        destroyer.onHit(50);
        frigate.onHit(50);
        destroyer.onHit(50);

        String printedData = "Frigate is exploding.Destroyer is exploding.Frigate is exploding.Destroyer lost.Destroyer is sinking.";
        assertEquals("Screen should contain expected data", printedData, screen.getPrintedData());
    }
}
