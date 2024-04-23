import java.util.Scanner;
public class Task02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите время от 0 до 24: ");
        int time = scanner.nextInt();
        if (time >= 0 && time < 6){
            System.out.println("доброй ночи");
        } else if (time >= 6 && time < 12) {
            System.out.println("доброе утро");

        } else if (time >= 12 && time < 18) {
            System.out.println("добрый день");
        } else if (time >= 18 && time < 24)  {
            System.out.println("Доброй ночи");
        } else {
            System.out.println("введите корректное значение");
        }
    }
}
