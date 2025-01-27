public class Main {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = -15;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
         int value = 75;

         if (value <= 0) {
            System.out.println("Красный");
         } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
         } else {
            System.out.println("Зеленый");
         }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 5;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumWithinRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printString(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
    }
    public static int[] fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }
    public static void multiplyLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }
    public static void fillDiagonals(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1; // Главная диагональ
            matrix[i][matrix.length - 1 - i] = 1; // Побочная диагональ
        }
    }
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    // Helper
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        // Задача 1
        printThreeWords();

        // Задача 2
        checkSumSign();

        // Задача 3
        printColor();

        // Задача 4
        compareNumbers();

        // Задача 5
        System.out.println(isSumWithinRange(8, 2));

        // Задача 6
        checkNumberSign(10);

        // Задача 7
        System.out.println(isNegative(10));

        // Задача 8
        printString("Hello", 3);

        // Задача 9
        System.out.println(isLeapYear(2024)); // true
        System.out.println(isLeapYear(1900)); // false

        // Задача 10
        int[] binaryArray = {1, 0, 1, 0};
        invertArray(binaryArray);
        System.out.println(arrayToString(binaryArray)); // [0, 1, 0, 1]

        // Задача 11
        int[] filledArray = fillArray();
        System.out.println(arrayToString(filledArray));

        // Задача 12
        int[] nums = {1, 5, 7, 3};
        multiplyLessThanSix(nums);
        System.out.println(arrayToString(nums)); // [2, 10, 7, 6]

        // Задача 13
        int[][] matrix = new int[5][5];
        fillDiagonals(matrix);
        for (int[] row : matrix) {
            System.out.println(arrayToString(row));
        }

        // Задача 14
        int[] array = createArray(5, 42);
        System.out.println(arrayToString(array)); // [42, 42, 42, 42, 42]
    }
}