import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FibonacciTest {
    @Test
    public void zeroFib() {
        assertAll(
          () -> assertEquals(0, Fibonacci.fib(0), "0 Fibonacci"),
          () -> assertEquals(0, Fibonacci.recFib(0), "0 Fibonacci")
        );
    }

    @Test
    public void negativeFib() {
        assertAll(
            //() -> assertEquals(-1, Fibonacci.fib(-1)),
            () -> assertEquals(-1, Fibonacci.recFib(-1), "Minus Fibonacci")
        );
    }

    @Test
    public void normalFib() {
        assertAll(
            () -> assertEquals(34, Fibonacci.fib(9), "Fibonacci with normal value"),
            () -> assertEquals(34, Fibonacci.recFib(9), "Fibonacci with normal value")
        );
    }

    @ParameterizedTest
    @CsvSource("8,6")
    public void sixFib(int expected, int in) {
        assertAll(
            () -> assertEquals(expected, Fibonacci.fib(in), "Fibonacci Test with given parameter"),
            () -> assertEquals(expected, Fibonacci.recFib(in), "Fibonacci Test with given parameter")
        );
    }

    /*@Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void endlessLoop() {
        assertTimeout(, executable);
    }*/
}
