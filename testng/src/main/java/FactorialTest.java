import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void testFactorialZero() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void testFactorialOne() {
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    public void testFactorialFive() {
        assertEquals(120, Factorial.factorial(5));
    }

    @Test
    public void testFactorialNegative() {
        assertEquals(0, Factorial.factorial(-1));
    }

    @Test(expectedExceptions = StackOverflowError.class)
    public void testFactorialLargeNumber() {
        Factorial.factorial(10000);
    }
}