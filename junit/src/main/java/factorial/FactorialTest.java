package factorial;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FactorialTest {
    @Test
    void testFactorialZero() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    void testFactorialOne() {
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    void testFactorialFive() {
        assertEquals(120, Factorial.factorial(5));
    }

    @Test
    void testFactorialNegative() {
        assertEquals(0, Factorial.factorial(-1));
    }
}
