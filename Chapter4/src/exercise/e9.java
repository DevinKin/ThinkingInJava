package exercise;

import java.util.Scanner;

public class e9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Fibonacci number: ");
        int n = sc.nextInt();
        Fibonacci(n);
    }
    static void Fibonacci(int n) {
        int i = 1;
        int next = 1;
        int r = next;
        System.out.print(i + " " + next + " ");
        while((next + i) < n) {
            r = next;
            next += i;
            i = r;
            System.out.print(next + " ");
        }
    }
}
