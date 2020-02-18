import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

public class FitTest {

    @Test
    public void manWeightTest(){
        double in = 181;
        double expected = 93.14;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected,out,0.01);
    }

    @Test
    public void womanWeightTest(){
        double in = 161;
        double expected = 70.14;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected,out,0.01);
    }
}
