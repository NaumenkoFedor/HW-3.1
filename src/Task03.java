import java.util.Scanner;
public class Task03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("выберете животное: ");
        System.out.println("1. Кошка");
        System.out.println("2. собака");
        System.out.println("3. рыба");
        System.out.println("4. комар");
        System.out.println("5. бобр");
        System.out.println("6. корова");
        System.out.println("7. баран");
        System.out.println("8. коза");
        System.out.println("9. муха");
        System.out.println("10. мышь");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("мяу");
                break;
            case 2:
                System.out.println("гав");
                break;
            case 3:
                System.out.println("буль");
                break;
            case 4:
                System.out.println("пиии");
                break;
            case 5:
                System.out.println("быр-быр");
                break;
            case 6:
                System.out.println("мууу");
                break;
            case 7:
                System.out.println("мэээээ");
                break;
            case 8:
                System.out.println("бээээ");
                break;
            case 9:
                System.out.println("жжжжжж");
                break;
            case 10:
                System.out.println("пи-пи");
                break;

            default:
                System.out.println("выберете животное из списка");
                break;
        }
    }
}