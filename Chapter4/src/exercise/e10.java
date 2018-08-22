package exercise;

import java.util.Scanner;

/**
 * 吸血鬼数字
 */
public class e10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number(1000-10000): ");
        int num = sc.nextInt();
        draculaNumber(num);
    }

    static void draculaNumber(int num) {
        if (num < 1000 || num > 10000) {
            System.out.println("Enter again: ");
            num = new Scanner(System.in).nextInt();
        }
        for (int i = 11; i < 100; i++) {
            if ((num % i) == 0) {
                System.out.println(num + " = " + i + " * " + num/i);
                continue;
            }
        }
    }
}
