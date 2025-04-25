package lab7;

import lab6.NewIntCalculator;
import org.junit.jupiter.api.*;
public class NewIntCalculatorTest {
    private NewIntCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator= new NewIntCalculator(0);
    }

    @Test

    public void add() {
        calculator = new NewIntCalculator(10);
        calculator.add(5);
        Assertions.assertEquals(15, calculator.result());
    }


    @Test

    public void testSubtractPositives() {
        calculator = new NewIntCalculator(10);
        calculator.subtract(3);
        Assertions.assertEquals(7, calculator.result());

    }

    @Test
    public void testSubtractNegatives() {
        calculator = new NewIntCalculator(-10);
        calculator.subtract(-5);
        Assertions.assertEquals(-5, calculator.result());
    }

    @Test

    public void testMultiplyPositives() {
        calculator = new NewIntCalculator(4);
        calculator.multiply(2);
        Assertions.assertEquals(8, calculator.result());
    }


    @Test
    public void testDividePositives() {
        calculator = new NewIntCalculator(4);
        calculator.divide(2);
        Assertions.assertEquals(2, calculator.result());
    }

    @Test
    public void init() {
        calculator = new NewIntCalculator(4);
        calculator.init();
        Assertions.assertEquals(0, calculator.result());
    }

        //ex 2

    @Test
    public void testDivideByZeroThrowsException_IntCalculator() {
        calculator = new NewIntCalculator(10);
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(0);
        });
    }

    @Test
    public void testMultiplyByZero_IntCalculator() {
        calculator = new NewIntCalculator(7);
        calculator.multiply(0);
        Assertions.assertEquals(0, calculator.result());
    }

    @AfterEach
    public void tearDown() {
        calculator = null;

    }
}
