package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(gcd(a, b));
        input.close();
    }

    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}
