import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class FailTest {
    @Test
    public void divideByZeroTest() {
        assertThrows(ArithmeticException.class, 
            () -> Fail.divideByZero(4)
        );
    }

    /*@Test
    public void tooBigIndex() {
        int[] arr = {1,3,4};
        assertThrows(ArrayIndexOutOfBounds.class, 
            () -> Fail.outOfIndex(arr)
        )
    }*/
}
