package translator;

// DeepL API using gradle
import com.deepl.api.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws DeepLException, InterruptedException {
        Scanner input = new Scanner ( System.in );
        while (true){
            System.out.println(translate(input.nextLine()).getText());
        }
    }

    public static TextResult translate(String phrase) throws DeepLException, InterruptedException{
        Translator translator;
        String apiKey = "cad456f3-8394-55f9-9cee-4af02c98b1db:fx";
        translator = new Translator(apiKey);
        TextResult result = translator.translateText(phrase, "en", "fr");
        return result;
    }
}
