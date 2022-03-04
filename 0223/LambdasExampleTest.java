import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.junit.Test;

public class LambdasExampleTest {

    @Test
    public void testRun1() {
        Integer result1 = LambdasExample.positiveWholeNumbers.get();
        Integer result2 = LambdasExample.positiveWholeNumbers.get();
        Integer result3 = LambdasExample.positiveWholeNumbers.get();
        Integer result4 = LambdasExample.positiveWholeNumbers.get();

        assertEquals(1, result1);
        assertEquals(2, result2);
        assertEquals(3, result3);
        assertEquals(4, result4);
    }

    @Test
    public void testRun2() {
        Integer result1 = LambdasExample.positiveWholeNumbers.get();
        Integer result2 = LambdasExample.positiveWholeNumbers.get();

        assertEquals(5, result1);
        assertEquals(6, result2);
    }

    @Test
    public void testRun3() {
        Integer result1 = LambdasExample.positiveWholeNumbers2.get();
        Integer result2 = LambdasExample.positiveWholeNumbers2.get();
        Integer result3 = LambdasExample.positiveWholeNumbers2.get();
        Integer result4 = LambdasExample.positiveWholeNumbers2.get();

        assertEquals(1, result1);
        assertEquals(2, result2);
        assertEquals(3, result3);
        assertEquals(4, result4);
    }

    @Test
    public void testRun4() {
        Supplier<Integer> pos = LambdasExample.positive.get();

        Integer result1 = pos.get();
        Integer result2 = pos.get();
        Integer result3 = pos.get();
        Integer result4 = pos.get();

        assertEquals(1, result1);
        assertEquals(2, result2);
        assertEquals(3, result3);
        assertEquals(4, result4);
    }

    @Test
    public void factorialTest() {
        Integer result1 = LambdasExample.factorial.apply(1);
        Integer result2 = LambdasExample.factorial.apply(5);

        assertEquals(1, result1);
        assertEquals(120, result2);
    }

    @Test
    public void factorialRecTest() {
        assertEquals(1, LambdasExample.facRecursive.apply(1));
        assertEquals(120, LambdasExample.facRecursive.apply(5));
    }

    @Test
    public void fibonacciTest() {
        Integer result1 = LambdasExample.fib.apply(0);
        Integer result2 = LambdasExample.fib.apply(9);

        assertEquals(0, result1);
        assertEquals(34, result2);
    }

    @Test
    public void fibonacciRecTest() {
        assertEquals(0, LambdasExample.recFib.apply(0));
        assertEquals(34, LambdasExample.recFib.apply(9));
    }

    @Test
    public void primeNumberTest() {
        boolean result1 = LambdasExample.isPrime.test(7);
        boolean result2 = LambdasExample.isPrime.test(24);

        assertFalse(result2);
        assertTrue(result1);
    }

    @Test
    public void mapTest() {
        Map<String, Integer> in1 = new HashMap<>();
        Map<String, Integer> in2 = new HashMap<>();

        in1.put("a", 2);
        in1.put("e", 3);
        in1.put("r", 3);

        in2.put("a", 5);
        in2.put("c", 3);
        in2.put("r", 5);

        Map<String, Integer> out = LambdasExample.sum.apply(in1,in2);

        assertEquals(7, out.get("a"));
        assertEquals(3, out.get("c"));
    }
}
