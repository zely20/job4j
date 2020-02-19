import org.junit.Test;
import ru.job4j.loop.Count;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CountTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Count.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToOne() {
        int rsl = Count.sumByEven(1, 1);
        int expected = 0;
        assertThat(rsl, is(expected));
    }
}
