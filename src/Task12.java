import java.util.Scanner;
public class Task12 {
        public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("введите номер билета 6 цифр  ");
int n = scanner.nextInt();

int left = (n / 100_000) % 10 + (n / 10_000)%10 + (n/1000)%10;
int right = (n / 100) % 10 + (n / 10)%10 + (n/1)%10;
        if (left == right){
        System.out.println("счастье");
        } else  {
                System.out.println("несчастье");

        }

                }
                }
