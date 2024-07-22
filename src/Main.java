import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();

        boolean resultTrueCompareNumbers2 = compareNumbers2(6, 12);
        System.out.println(resultTrueCompareNumbers2);
        boolean resultFalseCompareNumbers2 = compareNumbers2(10, 12);
        System.out.println(resultFalseCompareNumbers2);

        comparePosNeg(10);
        comparePosNeg(-10);
        comparePosNeg(0);

        boolean resultCompare2 = comparePosNeg2(-10); //10, 0
        System.out.println(resultCompare2);

        stringOut("LIMITS", 5);

        boolean resultYear = leapYear(2024); //1800, 2000
        System.out.println(resultYear);

        arrayFill();

        arrayFill2();

        arrayAlg();

        array2d();

        inputArray(10, 228);
    }

    public static void printThreeWords() {
        String[] array = new String[]{"Orange", "Banana", "Apple"};
        System.out.println("\nЗадание №1");
        for (String i : array) {
            System.out.println(i);
        }
    }

    public static void checkSumSign() {
        int a = 1531, b = 654;
        int checkSumResult = a + b;
        System.out.println("\nЗадание №2");

        if (checkSumResult >= 0) {
            System.out.printf("Ответ: %d%nСумма положительная!", checkSumResult);
        } else {
            System.out.printf("Ответ: %d%nСумма отрицательная!", checkSumResult);
        }
    }

    public static void printColor() {
        Scanner scanner = new Scanner(System.in);
        int value;

        System.out.println("\n\nЗадание №3");
        System.out.println("Введите число: ");
        value = scanner.nextInt();

        if (value <= 0) {
            System.out.println("___RED___");
        } else if (value > 0 && value <= 100) {
            System.out.println("___YELLOW___");
        } else {
            System.out.println("___GREEN___");
        }
        scanner.close();
    }

    public static void compareNumbers() {
        int a = 100, b = 10;
        System.out.println("\n\nЗадание №4");

        if (a >= b) {
            System.out.println(a + " >= " + b);
        } else {
            System.out.println(a + " < " + b);
        }
    }

    public static boolean compareNumbers2(int a, int b) {
        System.out.println("\n\nЗадание №5");

        int compareSum = a + b;

        return compareSum >= 10 && compareSum <= 20;
    }

    public static void comparePosNeg(int a) {
        System.out.println("\n\nЗадание №6");

        if (a >= 0) {
            System.out.println("Число положительное!");
        } else {
            System.out.println("Число отрицательное!");
        }
    }

    public static boolean comparePosNeg2(int a) {
        System.out.println("\n\nЗадание №7");

        return a < 0;

    }

    public static void stringOut(String a, int b) {
        System.out.println("\n\nЗадание №8");

        for (int i = 1; i <= b; i++) {
            System.out.println(a);
        }
    }

    public static boolean leapYear(int a) {
        System.out.println("\n\nЗадание №9");

        if (a % 400 == 0 || (a % 100 != 0 && a % 4 == 0)) {
            return true;
        } else {
            return false;
        }

    }

    public static void arrayFill() {
        System.out.println("\n\nЗадание №10");

        int[] array = new int[]{0, 1, 1, 0, 1, 1, 0, 0};

        for (int i : array) {
            if (i == 0) {
                i = 1;
            } else {
                i = 0;
            }
            System.out.println(i);

        }

    }

    public static void arrayFill2() {
        System.out.println("\n\nЗадание №11");

        int[] array = new int[101];

        for (int i = 0; i <= 100; i++) {
            array[i] += i;
            System.out.println(array[i]);
        }
    }

    public static void arrayAlg() {
        System.out.println("\n\nЗадание №12");

        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i : array) {
            if (i < 6) {
                i *= 2;

            }
            System.out.println(i);
        }
    }

    public static void array2d() {
        System.out.println("\n\nЗадание №13");

        int[][] array = new int[5][5];

        for (int i = 0; i <= 4; i++){
            array[i][i] += 1;
        }

        for (int i = 0; i <= 4; i++){
            for (int a = 0; a <= 4; a++){
                System.out.println(array[i][a]);
            }
        }

    }
    public static void inputArray(int len, int initialValue){
        System.out.println("\n\nЗадание №14");
        int[] array = new int[len];

        for (int i = 0; i < len; i++){
            array[i] += initialValue;
            System.out.println(array[i]);
        }
    }
}