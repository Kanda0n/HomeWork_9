public class Main {
    public static void main(String[] args) {
        System.out.println("Tsk 1");
        int[] expences = new int[5];
        expences[0] = 51245;
        expences[1] = 17488;
        expences[2] = 45789;
        expences[3] = 51776;
        expences[4] = 0;
        int sum = 0;
        for (int i = 0; i < expences.length; i++) {
            sum += expences[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Task 2");
        int[] expences2 = new int[5];
        expences2[0] = 54245;
        expences2[1] = 19488;
        expences2[2] = 45790;
        expences2[3] = 51876;
        expences2[4] = 7250;
        int min = 999999999;
        int max = 0;
        for (int week : expences2) {
            if (week < min) {
                min = week;
            }
            if (week > max) {
                max = week;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min
                + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");

        System.out.println("Task 3");
        int[] expences3 = new int[5];
        expences3[0] = 51200;
        expences3[1] = 19408;
        expences3[2] = 41689;
        expences3[3] = 51326;
        expences3[4] = 8555;
        sum = 0;
        double average = 0.0;
        for (int i = 0; i < expences.length; i++) {
            sum += expences[i];
        }
        average = (double) sum / expences3.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char changer = 0;
            changer = reverseFullName[reverseFullName.length - (i + 1)];
            reverseFullName[reverseFullName.length - (i + 1)] = reverseFullName[i];
            reverseFullName[i] = changer;
        }
        for (char c : reverseFullName) {
            System.out.print(c);
        }
    }
}