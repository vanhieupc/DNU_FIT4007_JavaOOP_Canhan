import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số thực: ");
        double a = scanner.nextDouble();

        int phanNguyen = (int) a;

        if (a == phanNguyen) {
            System.out.println(a + " là số nguyên.");
        } else {
            System.out.println(a + " không phải là số nguyên.");
        }

        scanner.close();
    }
}
