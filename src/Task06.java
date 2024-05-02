import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int daysInYear;
        System.out.println("введите год: ");
        int year = scanner.nextInt();
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("год " + year + " високостный");
            daysInYear = 366;

        } else {
            System.out.println("год " + year + " не високостный");
            daysInYear = 365;
        }
        System.out.println("в году " + year + " - " + daysInYear + " дней");
    }
}