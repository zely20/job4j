import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.condition.Point;

@Ignore
public class PointTest {

    @Test
    public void distanceTest() {
        double expected = 2.82;
        Point a = new Point(1, 3);
        Point b = new Point(3, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceTwoTest() {
        double expected = 2.82;
        Point a = new Point(1, 3);
        Point b = new Point(3, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
