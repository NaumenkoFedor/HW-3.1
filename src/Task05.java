import java.util.Scanner;
public class Task05 {

    public static void main(String[] args) {
                String[] nazv = {"Крыса", "Корова", "Тигр"

        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число, месяц и год: 5 12 1974: ");
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int god = scanner.nextInt();
        String zodiacGod = nazv[(god - 4) % 12];

        String zodiacSign = "";
        switch (m){
            case 1:
                if (d < 20) {
                    zodiacSign = "козерог";
                }else {
                    zodiacSign = "водолей";
                }
                break;
            case 2:
                if (d < 19) {
                    zodiacSign = "водолей";
                }else {
                    zodiacSign = "рыба";
                }
                break;
            case 3:
                if (d < 21) {
                    zodiacSign = "рыба";
                }else {
                    zodiacSign = "овен";
                }
                break;
            case 4:
                if (d < 20) {
                    zodiacSign = "овен";
                }else {
                    zodiacSign = "телец";
                }
                break;
            case 5:
                if (d < 24) {
                    zodiacSign = "телец";
                }else {
                    zodiacSign = "близнецы";
                }
                break;

            case 6:
                 if (d < 22) {
                     zodiacSign = "близнецы";
                }else {
                    zodiacSign = "рак";
                 }
                 break;

        case 7:
        if (d < 23) {
            zodiacSign = "рак";
        }else {
            zodiacSign = "лев";
        }
        break;
        case 8:
        if (d < 23) {
            zodiacSign = "лев";
        }else {
            zodiacSign = "дева";
        }
        break;
        case 9:
        if (d < 23) {
            zodiacSign = "дева";
        }else {
            zodiacSign = "весы";
        }
        break;
        case 10:
        if (d < 23) {
            zodiacSign = "весы";
        }else {
            zodiacSign = "скорпион";
        }
        break;
        case 11:
        if (d < 23) {
            zodiacSign = "скорпион";
        }else {
            zodiacSign = "стрелец";
        }
        break;
        case 12:
        if (d < 22) {
            zodiacSign = "стрелец";
        }else {
            zodiacSign = "козерог";
        }
        break;
        }
        System.out.println();




  }
    }
