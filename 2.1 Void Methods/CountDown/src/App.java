import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner ( System.in);
        int start = input.nextInt();
        int end = input.nextInt();  
        countDown(start, end);
        input.close();
    }

    public static void countDown(int start, int end){
        for(int i = start; i >= end; i--){
            System.out.println(i);
        }   
    }
}


