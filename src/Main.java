public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int spendMax = arr[0];
        int spendMin = arr[0];
        for (int i : arr) {
            if (spendMin > i)
                spendMin = i;
            if (spendMax < i)
                spendMax = i;
        }
        System.out.println("Минимальная сумма трат за день составила " + spendMin);
        System.out.println("Максимальная сумма трат за день составила " + spendMax);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double spendAverage = arr[0];
        for (int i : arr) {
            spendAverage += i;
        }
        spendAverage /= 30;
        System.out.printf("Средняя сумма трат за месяц составила %.2f ", spendAverage);
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}