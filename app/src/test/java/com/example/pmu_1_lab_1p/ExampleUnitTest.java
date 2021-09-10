package com.example.pmu_1_lab_1p;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        MinMaxFun func = new MinMaxFun();
        assertEquals(4, func.min(4, 10));
        assertEquals(-5, func.min(22, -5));
        assertEquals(0, func.min(15, 0));
        assertEquals(-10, func.min(0, -10));

        assertEquals(4, func.max(4, 1));
        assertEquals(10, func.max(-3, 10));
        assertEquals(-5, func.max(-11, -5));
        assertEquals(1, func.max(1, 0));
    }
}