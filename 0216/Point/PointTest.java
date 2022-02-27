package Point;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class PointTest {

    Point p;

    @BeforeEach
    public void beforeEach() {
        p = new Point(2, 5);
    }

    @Test
    public void otherConstructor() {
        Point v = new Point(4,5);
        //Point a = new Point(v);

        assertAll(
            () -> assertEquals(2, p.getX(), "BeforeEach Test"),
            () -> assertEquals(4, v.getX(), "Constructor Test")
            //() -> assertEquals(4, a.getX())
        );
    }

    @Test
    public void setXTest() {
        p.setX(4);
        assertEquals(4, p.getX());
    }
}
