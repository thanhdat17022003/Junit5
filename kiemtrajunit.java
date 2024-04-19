import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumCalculatorTest {
    @Test
    public void testCalculateSumWithPositiveNumber() {
        assertEquals(15, SumCalculator.calculateSum(5));
    }

    @Test
    public void testCalculateSumWithZero() {
        assertEquals(0, SumCalculator.calculateSum(0));
    }

    @Test
    public void testCalculateSumWithNegativeNumber() {
        assertEquals(-15, SumCalculator.calculateSum(-5));
    }
}
