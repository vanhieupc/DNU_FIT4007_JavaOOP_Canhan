import java.util.Scanner;

public class Bai29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên đại diện giới tính (0 - Nam, 1 - Nữ, 2 - Khác): ");
        int gender = scanner.nextInt();

        switch (gender) {
            case 0:
                System.out.println("Giới tính: Nam");
                break;
            case 1:
                System.out.println("Giới tính: Nữ");
                break;
            case 2:
                System.out.println("Giới tính: Khác");
                break;
            default:
                System.out.println("Giá trị không hợp lệ. Vui lòng nhập 0, 1 hoặc 2.");
                break;
        }

        scanner.close();
    }
}
