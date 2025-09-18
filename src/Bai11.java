import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập 2 số nguyên
        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        // In ra trước khi hoán đổi
        System.out.println("Trước khi hoán đổi: a = " + a + ", b = " + b);

        // Hoán đổi bằng biến trung gian
        int c = a;
        a = b;
        b = c;

        // In ra sau khi hoán đổi
        System.out.println("Sau khi hoán đổi: a = " + a + ", b = " + b);

        scanner.close();
    }
}
