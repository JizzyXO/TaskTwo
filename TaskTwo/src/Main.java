import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        System.out.println("Сумма в пределах от 10 до 20: " + isSumInRange(num1, num2));

        int number = -8;
        printPositivity(number);

        int checkNegative = -5;
        System.out.println("Число отрицательное: " + isNegative(checkNegative));

        String strToPrint = "Привет!";
        int repeatCount = 3;
        printStringMultipleTimes(strToPrint, repeatCount);

        int yearToCheck = 2024;
        System.out.println("Год високосный: " + isLeapYear(yearToCheck));

        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(binaryArray);
        System.out.println("Инвертированный массив: " + Arrays.toString(binaryArray));

        int arrayLength = 100;
        int[] filledArray = fillArray(arrayLength);
        System.out.println("Массив от 1 до 100: " + Arrays.toString(filledArray));

        int[] arrayToMultiply = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThanSix(arrayToMultiply);
        System.out.println("Массив после умножения: " + Arrays.toString(arrayToMultiply));

        int matrixSize = 5; // Размер квадратной матрицы
        int[][] diagonalMatrix = new int[matrixSize][matrixSize];
        fillDiagonal(diagonalMatrix);
        System.out.println("Матрица с единичной диагональю:");
        printMatrix(diagonalMatrix);

        int len = 10;
        int initialValue = 42;
        int[] createdArray = createArray(len, initialValue);
        System.out.println("Созданный массив: " + Arrays.toString(createdArray));
    }

    public static boolean isSumInRange(int num1, int num2) {
        int sum = num1 + num2;
        return sum >= 10 && sum <= 20;
    }

    public static void printPositivity(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    public static int[] fillArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static void multiplyLessThanSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    public static void fillDiagonal(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}