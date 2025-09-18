import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập 2 số nguyên
        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        // In ra trước khi hoán đổi
        System.out.println("Trước khi hoán đổi: a = " + a + ", b = " + b);

        // Hoán đổi không dùng biến phụ
        a = a + b;  // a giờ là tổng của a và b
        b = a - b;  // b giờ là giá trị ban đầu của a
        a = a - b;  // a giờ là giá trị ban đầu của b

        // In ra sau khi hoán đổi
        System.out.println("Sau khi hoán đổi: a = " + a + ", b = " + b);

        scanner.close();
    }
}
