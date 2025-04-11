package lab7;
import lab6.DoubleCalculator;
import org.junit.jupiter.api.*;

public class DoubleCalculatorTest {
    private DoubleCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator= new DoubleCalculator(0);
    }

    @Test

    public void add() {
        calculator.add(5);

    }

    @Test
    public void subtract() {
        calculator.subtract(5);

    }

    @Test
    public void multiply() {
        calculator=null;
    }

}
