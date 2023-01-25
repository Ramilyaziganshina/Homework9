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

    public static void task1 () {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int spendingAmount = 0;
        for (int i : arr) {
            spendingAmount += i;
        }
        System.out.println("Сумма трат за месяц составила " + spendingAmount + " рублей");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int amountMin = 200000;
        int amountMax = 0;
        for (int i : arr) {
            if (i < amountMin) {
                amountMin = i;
            }
        }
        for (int i : arr) {
            if (i > amountMax) {
                amountMax = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + amountMin + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + amountMax + " рублей");
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double spendingAmount = 0;
        for (int i : arr) {
            spendingAmount += i;
        }
        double averageAmount = spendingAmount / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length-1; index >= 0; index--) {
            System.out.print(reverseFullName[index]);
        }
        System.out.println();
    }
}