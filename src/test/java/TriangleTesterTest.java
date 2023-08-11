import static org.junit.Assert.*;

import _7_kyu.TriangleTester;
import org.junit.Test;


public class TriangleTesterTest {
    @Test
    public void publicTests() {
        assertTrue(TriangleTester.isTriangle(1, 2, 2));
        assertFalse(TriangleTester.isTriangle(7, 2, 2));
    }
}