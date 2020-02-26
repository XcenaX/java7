package strings;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;



public class Main {

    public static void main(String[] args) {
        String lang;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Выберите язык:");
            System.out.println("1 - Русский");
            System.out.println("2 - English");
            lang = scanner.nextLine();

            boolean stop = false;
            switch (lang){
                case "1":
                    lang = "RU";
                    stop = true;
                    break;
                case "2":
                    lang = "EN";
                    stop = true;
                    break;
                default:
                    System.out.println("Тебе русским языком сказано напиши цифру от 1 до 2!");
            }
            if(stop){
                break;
            }
        }
        Locale local = new Locale(lang);

        ResourceBundle rb = ResourceBundle.getBundle("text", local);

        String cpu = rb.getString("cpu");
        String memory = rb.getString("memory");
        String storage = rb.getString("storage");

        System.out.println(cpu);
        System.out.println(memory);
        System.out.println(storage);



    }
}
