import org.junit.Test;
import ru.job4j.condition.Point;
import ru.job4j.condition.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        Triangle a = new Triangle();
        boolean result = a.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenNoExist() {
        Triangle a = new Triangle();
        boolean result = a.exist(0.0, 2.0, 2.0);
        assertThat(result, is(false));
    }
}
