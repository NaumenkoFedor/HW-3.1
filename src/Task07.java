import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task07 {
        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("введите символ: ");
                String simbol = scanner.nextLine();

                Pattern patKirLetter = Pattern.compile("а-яА-Я");
                Matcher matKirLetter = patKirLetter.matcher(simbol);

                Pattern patLatLetter = Pattern.compile("a-zA-Z");
                Matcher matLatLetter = patLatLetter.matcher(simbol);

                Pattern patNumber = Pattern.compile("0-9");
                Matcher matNumber = patNumber.matcher(simbol);

                if (matLatLetter.matches()) {
                        System.out.println("латинница");

                } else if (matKirLetter.matches()) {
                        System.out.println("кириллица");


                } else if (matNumber.matches()) {
                        System.out.println("цифра");


                } else {
                        System.out.println("невозможно определить");
                }
        }
}