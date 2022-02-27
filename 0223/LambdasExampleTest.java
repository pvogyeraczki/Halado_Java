import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
