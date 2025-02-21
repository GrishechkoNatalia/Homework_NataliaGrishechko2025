public class Main {
    public static int calculateSum(String[][] array, int size) throws MyArraySizeException, MyArrayDataException {
        if (array.length != size) {
            throw new MyArraySizeException("Размер массива должен быть " + size + "x" + size);
        }
        for (String[] row : array) {
            if (row.length != size) {
                throw new MyArraySizeException("Размер массива должен быть " + size + "x" + size);
            }
        }

        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка в ячейке: [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "six", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = calculateSum(validArray, 4);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            int sum = calculateSum(invalidSizeArray, 4);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            int sum = calculateSum(invalidDataArray, 4);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}