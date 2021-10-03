import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleActionTest {

    @Test
    public void calculatePerimeter() {
        double x = 3;
        double y =4;
        double realY;
        double expectedY = 12;
        realY = TriangleAction.calculatePerimeter(x,y);
        Assert.assertEquals(expectedY, realY, 0.00000001);

    }

    @Test
    public void calculateSquare() {
        double x = 3;
        double y =4;
        double realY;
        double expectedY = 6;
        realY = TriangleAction.calculateSquare(x,y);
        Assert.assertEquals(expectedY, realY, 0.00000001);
    }
}