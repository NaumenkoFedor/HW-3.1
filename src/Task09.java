import java.util.Scanner;
public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите координаты начала отрезка x1 y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("введите координаты начала отрезка x2 y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        if (x1 == x2 && y1 == y2) {
            System.out.println("отрезок является точкой");
        } else if (x1 == x2) {
            System.out.println("вертикальная линия");


        } else {
            double slope = (y2 - y2) / (x2 - x1);
            if (slope == 0) {
                System.out.println("горизонтальная линия");
            } else if (slope > 0) {
                System.out.println("подьем");
            } else {
                System.out.println("спуск");
            }
        }
    }
}