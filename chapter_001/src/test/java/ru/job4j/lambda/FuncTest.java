package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FuncTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        Func func = new Func();
        List<Double> result = func.diapason(5, 8, x -> Double.valueOf(2 * x + 1));
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenLinearResults() {
        Func func = new Func();
        List<Double> result = func.diapason(5, 8, x -> Double.valueOf(2 * Math.pow(x,2) + 1));
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenLinearResults() {
        Func func = new Func();
        List<Double> result = func.diapason(5, 8, x -> Double.valueOf(2 * x + 1));
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }
}