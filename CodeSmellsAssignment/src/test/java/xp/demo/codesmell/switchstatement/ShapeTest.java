package xp.demo.codesmell.switchstatement;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class ShapeTest {

    private Shape shape = new Shape();

    @Test
    public void testAreaOfRectangle() {
        double length = 10.0;
        double width = 20.0;
        shape.setLength(length);
        shape.setWidth(width);
        assertThat(shape.calculateArea(Shape.RECTANGLE), is(200.0));
    }

    @Test
    public void testPerimeterOfRectangle() {
        double length = 10.0;
        double width = 20.0;
        shape.setLength(length);
        shape.setWidth(width);
        assertThat(shape.calculatePerimeter(Shape.RECTANGLE), is(60.0));
    }

    @Test
    public void testAreaOfCircle() {
        double radius = 10.0;
        shape.setRadius(radius);
        assertThat(shape.calculateArea(Shape.CIRCLE), is(314.16));
    }

    @Test
    public void testPerimeterOfCircle() {
        double radius = 10.0;
        shape.setRadius(radius);
        assertThat(shape.calculatePerimeter(Shape.CIRCLE), is(62.83));
    }
}
