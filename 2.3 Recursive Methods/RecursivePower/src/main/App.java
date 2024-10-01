package main;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(recursivePower(2, 5));
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