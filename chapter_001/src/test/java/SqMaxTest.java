import org.junit.Test;
import ru.job4j.condition.SqMax;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void maxThirdTest() {
        int result = SqMax.max(6, 4, 7, 5);
        assertThat(result, is(7));
    }

    @Test
    public void maxOneTest() {
        int result = SqMax.max(6, 4, 5, 3);
        assertThat(result, is(6));
    }

    @Test
    public void maxTwoTest() {
        int result = SqMax.max(6, 8, 5, 3);
        assertThat(result, is(8));
    }

    @Test
    public void maxForthTest() {
        int result = SqMax.max(6, 4, 5, 8);
        assertThat(result, is(8));
    }
}
