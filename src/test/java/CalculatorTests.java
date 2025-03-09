import calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {
    @Test
    void testFactorial() {
        assertEquals(120, Calculator.factorial(5));
        assertEquals(1, Calculator.factorial(0));
        assertThrows(IllegalArgumentException.class, () -> Calculator.factorial(-1));
    }

    @Test
    void testTriangleArea() {
        assertEquals(6.0, Calculator.triangleArea(3, 4, 5), 0.001);
        assertThrows(IllegalArgumentException.class, () -> Calculator.triangleArea(1, 1, 3));
        assertThrows(IllegalArgumentException.class, () -> Calculator.triangleArea(1, 3, 1));
        assertThrows(IllegalArgumentException.class, () -> Calculator.triangleArea(3, 1, 1));
    }

    @Test
    void testCalculate() {
        assertEquals(8, Calculator.calculate(5, 3, '+'));
        assertEquals(2, Calculator.calculate(5, 3, '-'));
        assertEquals(15, Calculator.calculate(5, 3, '*'));
        assertEquals(2, Calculator.calculate(6, 3, '/'));
        assertThrows(ArithmeticException.class, () -> Calculator.calculate(5, 0, '/'));
        assertThrows(IllegalArgumentException.class, () -> Calculator.calculate(5, 3, '%'));
    }

    @Test
    void testCompareNumbers() {
        assertEquals("Первое число больше второго", Calculator.compareNumbers(10, 5));
        assertEquals("Первое число меньше второго", Calculator.compareNumbers(5, 10));
        assertEquals("Числа равны", Calculator.compareNumbers(7, 7));
    }
}
