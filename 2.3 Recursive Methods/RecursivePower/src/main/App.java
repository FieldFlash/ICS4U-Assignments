package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int exp = input.nextInt();
        System.out.println(recursivePower(base, exp));
        input.close();
    }

    public static int recursivePower(int base, int exp) {
        if (exp == 0){
            return 1;
        } 
        else {
            return base * recursivePower(base,exp-1);
        }
    }
}