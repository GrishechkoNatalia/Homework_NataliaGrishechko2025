import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[][] nums = new String[4][4];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = String.valueOf(random.nextInt(100));
            }
        }

        /// Проверка ошибки
        // nums[2][3] = "asd";

        try {
            calculateSum(nums);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void calculateSum(String[][] array) throws Exception {
        if (array.length != 4 || array[0].length != 4
        || array[1].length != 4
        || array[2].length != 4
        || array[3].length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int number = Integer.parseInt(array[i][j]);
                    sum += number;
                } catch(NumberFormatException ignored) {
                    throw new MyArrayDataException("Ошибка в элементе: " + i + ": " + j);
                }
            }
        }

        System.out.println("Сумма: " + sum);
    }
}