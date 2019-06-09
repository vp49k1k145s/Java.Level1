/**
 * Java.Level1.Lesson3
 * @autor Вадим, Дзюбенко
 * @version 05,06,2019
 */


import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        int and = 1;
        while (and == 1) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int a = random.nextInt(10);
            System.out.println("Введите число от 0 до 9");
            boolean d = false;
            for (int i = 0; i < 3; i++) {
                int b = scanner.nextInt();
                if (b < a) {
                    System.out.println("Введеное число меньше. Попробуйде еще раз!!");
                } else if (b > a) {
                    System.out.println("Введеное число больше. Попробуйде еще раз!!");
                } else if (b == a) {
                    d = true;
                    System.out.println("Поздравляем вы выйграли!!! ");
                    break;
                }
            }
            if (!d) {
                System.out.println("Game Over!!! ");
            }

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            and = scanner.nextInt();

        }
    }
}

