import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число x ");
        int x = scanner.nextInt();
        System.out.println("введите число y ");
        int y = scanner.nextInt();
        if (x % 2 == 0 && y % 2 == 0) {
            System.out.println("yes");

        } else if (x % 2 != 0 && y % 2 != 0) {
            System.out.println("no");
        }
    }
}