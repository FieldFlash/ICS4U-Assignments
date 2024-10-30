import javaui.Menu;
import javaui.Test;
import javaui.ToDo;

public class App {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu("TerminalMenu");

        menu.addOption("Option 1", ()->{
            System.out.println("Option 3 selected");
            menu.start();
        });

        menu.addOption("Option 2", ()->{
            System.out.println("Option 3 selected");
            menu.start();
        });

        menu.addOption("Exit", ()->{
            System.out.println("Exiting");
        });

        menu.start();
    }
}
