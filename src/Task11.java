
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите коэффициент А ");
        double a = scanner.nextDouble();
        System.out.println("введите коэффициент B ");
        double b = scanner.nextDouble();
        System.out.println("введите коэффициент C ");
        double c = scanner.nextDouble();

        double diskr = b * b - 4 * a * c;
        if (diskr > 0) {
            double x1 = (-b + Math.sqrt(diskr)) / (2 * a);
            double x2 = (-b - Math.sqrt(diskr)) / (2 * a);
            System.out.println("корни квадратного уравнения Х1 = " + x1 + " x2 = " + x2);

        } else if (diskr == 0) {
            double x = -b / (2 * a);
            System.out.println("корень квадратного уравнения х = " + x);


        } else {
            System.out.println("нет");

        }
    }
}