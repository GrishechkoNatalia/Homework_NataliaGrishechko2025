package calculator;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CalculatorTests {

    // Тест для метода factorial
    @Test
    public void testFactorial() {
        assertEquals(Calculator.factorial(5), 120);  // 5! = 120
        assertEquals(Calculator.factorial(0), 1);    // 0! = 1
        assertThrows(IllegalArgumentException.class, () -> Calculator.factorial(-1));  // Ожидаем исключение для отрицательных чисел
    }

    // Тест для метода triangleArea
    @Test
    public void testTriangleArea() {
        assertEquals(Calculator.triangleArea(3, 4, 5), 6.0, 0.001);  // Площадь треугольника со сторонами 3, 4, 5
        assertThrows(IllegalArgumentException.class, () -> Calculator.triangleArea(1, 1, 3));  // Невозможно построить треугольник
        assertThrows(IllegalArgumentException.class, () -> Calculator.triangleArea(3, 1, 1));  // Невозможно построить треугольник
        assertThrows(IllegalArgumentException.class, () -> Calculator.triangleArea(1, 3, 1));  // Невозможно построить треугольник
    }

    // Тест для метода calculate
    @Test
    public void testCalculate() {
        assertEquals(Calculator.calculate(5, 3, '+'), 8);  // 5 + 3 = 8
        assertEquals(Calculator.calculate(5, 3, '-'), 2);  // 5 - 3 = 2
        assertEquals(Calculator.calculate(5, 3, '*'), 15); // 5 * 3 = 15
        assertEquals(Calculator.calculate(5, 5, '/'), 1);  // 5 / 5 = 1
        assertThrows(ArithmeticException.class, () -> Calculator.calculate(5, 0, '/')); // Деление на ноль
        assertThrows(IllegalArgumentException.class, () -> Calculator.calculate(5, 3, '%')); // Недопустимая операция
    }

    // Тест для метода compareNumbers
    @Test
    public void testCompareNumbers() {
        assertEquals(Calculator.compareNumbers(5, 3), "Первое число больше второго");  // 5 > 3
        assertEquals(Calculator.compareNumbers(3, 5), "Первое число меньше второго");  // 3 < 5
        assertEquals(Calculator.compareNumbers(5, 5), "Числа равны");  // 5 == 5
    }
}
