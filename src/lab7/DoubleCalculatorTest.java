package lab7;
import lab6.DoubleCalculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DoubleCalculatorTest {
    private DoubleCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new DoubleCalculator(0.0);
    }

    @Test
    public void testAddPositive() {
        calculator = new DoubleCalculator(5.0);
        calculator.add(3.0);
        assertEquals(8.0, calculator.result());
    }

    @Test
    public void testAddNegatives() {
        calculator = new DoubleCalculator(-5.0);
        calculator.add(-3.0);
        assertEquals(-8.0, calculator.result());
    }

    @Test
    public void testSubtractPositives() {
        calculator = new DoubleCalculator(10.0);
        calculator.subtract(4.0);
        assertEquals(6.0, calculator.result());
    }

    @Test
    public void testSubtractNegatives() {
        calculator = new DoubleCalculator(-10.0);
        calculator.subtract(-5.0);
        assertEquals(-5.0, calculator.result());
    }

    @Test
    public void testMultiplyPositives() {
        calculator = new DoubleCalculator(3.0);
        calculator.multiply(2.0);
        assertEquals(6.0, calculator.result());
    }

    @Test
    public void testMultiplyNegatives() {
        calculator = new DoubleCalculator(-3.0);
        calculator.multiply(-2.0);
        assertEquals(6.0, calculator.result());
    }

    @Test
    public void testMultiplyBy0() {
        calculator = new DoubleCalculator(123.45);
        calculator.multiply(0.0);
        assertEquals(0.0, calculator.result());
    }

    @Test
    public void testDividePositives() {
        calculator = new DoubleCalculator(10.0);
        calculator.divide(2.0);
        assertEquals(5.0, calculator.result());
    }

    @Test
    public void testDivideNegatives() {
        calculator = new DoubleCalculator(-10.0);
        calculator.divide(-2.0);
        assertEquals(5.0, calculator.result());
    }

    @Test
    public void testDivideBy0Double() {
        calculator = new DoubleCalculator(5.0);
        calculator.state = (Double)calculator.state / 0.0;
        Assertions.assertTrue(((Double) calculator.result()).isInfinite());
    }

    @Test
    public void testInit() {
        calculator = new DoubleCalculator(99.99);
        calculator.init();
        assertEquals(0.0, calculator.result());
    }

    //ex2

    @Test
    public void testDivideByZeroThrowsException_DoubleCalculator() {
        calculator = new DoubleCalculator(5.0);
        assertThrows(ArithmeticException.class, () -> calculator.divide(0.0));
    }

    @Test
    public void testMultiplyByZero_DoubleCalculator() {
        calculator = new DoubleCalculator(3.14);
        calculator.multiply(0.0);
        Assertions.assertEquals(0.0, (Double) calculator.result(), 0.0001);
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }
}
