import java.util.Scanner;
public class Task04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("введите координату х: ");
        double x = scanner.nextDouble();
        System.out.print("введите координату y: ");
        double y = scanner.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("точка в первой четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("точка во 2 четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("точка во 3 четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("точка во 4 четверти");
        } else {
            System.out.println("точка находится для окружности");
        }
    }
}