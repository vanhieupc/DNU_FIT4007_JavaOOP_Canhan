import java.util.Scanner;

public class Bai32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        System.out.print("Nhập tháng (1-12): ");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Tháng không hợp lệ.");
            scanner.close();
            return;
        }

        boolean isLeapYear = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }

        int days;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = isLeapYear ? 29 : 28;
                break;
            default:
                days = 0;
        }

        System.out.println("Tháng " + month + " năm " + year + " có " + days + " ngày.");

        scanner.close();
    }
}
