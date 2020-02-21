import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqArea;

public class SqAreaTest {

    @Test
    public void squareTest() {
        double expected = 1;
        double out = SqArea.square(4, 1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void squareTwoTest() {
        double expected = 2.00;
        double out = SqArea.square(6, 2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
