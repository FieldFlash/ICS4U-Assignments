import java.util.Scanner;

import StaticStack.StaticStack;

public class Main {
    public static void main(String[] args) throws Exception {
        //clear();
        Scanner input = new Scanner(System.in);
        String word = input.nextLine(); 
        String reversedWord = "";
        StaticStack<Character> stack = new StaticStack<>(word.length());
 
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        while (stack.isEmpty() == false) {
            reversedWord += stack.pop();
        }
        System.out.println("Reversed word: " + reversedWord);
        input.close();
    }

    //public static void clear(){
        // clearing the console
      //  System.out.print("\033[H\033[2J");
    //}
}
