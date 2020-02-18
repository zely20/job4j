import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {

    @Test
    public void distanceTest(){
        double expected = 2.82;
        double out  = Point.distance(1,3,3,1);
        Assert.assertEquals(expected,out,0.01);
    }

    @Test
    public void distanceTwoTest(){
        double expected = 2.00;
        double out  = Point.distance(0,0,2,0);
        Assert.assertEquals(expected,out,0.01);
    }
}
