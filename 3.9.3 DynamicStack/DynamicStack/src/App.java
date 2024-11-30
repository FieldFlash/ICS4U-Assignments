import java.util.Scanner;

public interface App {
    public static void main(String args[]) {
        //clear();
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] start = { "(", "{", "[" };
        String[] end = { ")", "}", "]" };
        System.out.println("Brackets are balanced: " + checkBalanced(text, start, end));
    }
    public static String checkBalanced(String input, String[] start, String[] end) {
        DynamicStack<Character> DyStack = new DynamicStack<>();
        try {
            for (char c : input.toCharArray()) {
                for (int i = 0; i < 3; i++) {
                    if (c == start[i].charAt(0)) {
                        DyStack.push((char)i);
                    }
                }
                for (int a = 0; a < 3; a++) {
                    if (c == end[a].charAt(0)) {
                        if (DyStack.pop() == a) {
                            return "true";
                        } else {
                            return "false";
                        }
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("You goofy goober");
        }
        return "false, no brackets or no closing bracket (or error)";
    }
    public static void clear(){
        // clearing the console
        System.out.print("\033[H\033[2J");
    }
}