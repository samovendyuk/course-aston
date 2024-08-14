import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(-1, 0);
        printColor(101);
        compareNumbers(4, 10);
        System.out.println(compareScale(10, 11));
        positiveOrNegative(-1);
        System.out.println(checkNumber(1));
        printString("How about this", 4);
        System.out.println(isLeapYear(10));
        replaceNumber();
        fillArray();
        doubleNumberInArray();
        fillDiagonal();
        createArray(20,3);
    }

    public static void printThreeWords() {
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple");
    }

    public static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }

    public static void  printColor(int value) {
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean compareScale(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("This is positive number");
        } else {
            System.out.println("This is negative number");
        }
    }

    public static boolean checkNumber(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printString(String string, int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println(string);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return false;
        }
    }

    public static void replaceNumber() {
        int [] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            }  else {
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray() {
        int [] array = new int[100];
        for (int i = 0; i <= array.length - 1; ++i) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void doubleNumberInArray() {
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillDiagonal() {
        int size = 8;
        int [][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            table[i][i] = 1;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i <array.length; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
    }
}
