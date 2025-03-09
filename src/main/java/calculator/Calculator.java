package calculator;

public class Calculator {
    // Метод для вычисления факториала числа
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Факториал не определен для отрицательных чисел");
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Метод для вычисления площади треугольника по формуле Герона
    public static double triangleArea(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Невозможно построить треугольник с такими сторонами");
        }
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Метод для выполнения арифметических операций
    public static int calculate(int a, int b, char operator) {
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b == 0) throw new ArithmeticException("Деление на ноль");
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Недопустимая операция");
        };
    }

    // Метод для сравнения двух чисел
    public static String compareNumbers(int a, int b) {
        if (a > b) return "Первое число больше второго";
        else if (a < b) return "Первое число меньше второго";
        else return "Числа равны";
    }

    // Основной метод для проверки
    public static void main(String[] args) {
        System.out.println("Факториал 5: " + factorial(5));
        System.out.println("Площадь треугольника со сторонами 3, 4, 5: " + triangleArea(3, 4, 5));
        System.out.println("5 + 3 = " + calculate(5, 3, '+'));
        System.out.println("Сравнение 10 и 20: " + compareNumbers(10, 20));
    }
}
