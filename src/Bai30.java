import java.util.Scanner;

public class Bai30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ký tự hướng (N, E, W, S): ");
        char ch = scanner.next().toUpperCase().charAt(0);

        switch (ch) {
            case 'N':
                System.out.println("Hướng Bắc");
                break;
            case 'S':
                System.out.println("Hướng Nam");
                break;
            case 'E':
                System.out.println("Hướng Đông");
                break;
            case 'W':
                System.out.println("Hướng Tây");
                break;
            default:
                System.out.println("Ký tự không hợp lệ. Vui lòng nhập N, E, W hoặc S.");
                break;
        }

        scanner.close();
    }
}
