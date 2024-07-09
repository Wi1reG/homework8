//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] salary = new int[5];
        int sum = 0;
        salary[0] = 10000;
        salary[1] = 15000;
        salary[2] = 12000;
        salary[3] = 11000;
        salary[4] = 14000;
        for (int element : salary) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //2 задание

        int[] salary1 = new int[5];
        int max = 0;
        int min = 999999;
        salary1[0] = 10000;
        salary1[1] = 15000;
        salary1[2] = 12000;
        salary1[3] = 11000;
        salary1[4] = 14000;
        for (int i = 0; i < salary1.length; i++) {
            if (salary1[i] < min) {
                min = salary1[i];
            }
        }
        for (int g = 0; g < salary1.length; g++) {
            if (salary1[g] > max) {
                max = salary1[g];
            }
        }
        System.out.println("Минимальаня сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей.");

        //3 задание

        int[] salary2 = new int[5];
        salary2[0] = 123123;
        salary2[1] = 15123;
        salary2[2] = 34575;
        salary2[3] = 123;
        salary2[4] = 234234;
        float average = (float) (salary2[0] + salary2[1] + salary2[2] + salary2[3] + salary2[4]) / salary.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        //4 задание

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }
}