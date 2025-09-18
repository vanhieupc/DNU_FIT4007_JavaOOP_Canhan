import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên dương b: ");
        int b = scanner.nextInt();

        System.out.print("Nhập số nguyên dương c: ");
        int c = scanner.nextInt();

        // Kiểm tra b là ước của a: a chia hết cho b (a % b == 0)
        // Kiểm tra b là bội của c: b chia hết cho c (b % c == 0)
        if (a > 0 && b > 0 && c > 0) {
            if (a % b == 0 && b % c == 0) {
                System.out.println(b + " là ước của " + a + " và là bội của " + c + ".");
            } else {
                System.out.println(b + " không phải là ước của " + a + " hoặc không phải là bội của " + c + ".");
            }
        } else {
            System.out.println("Vui lòng nhập các số nguyên dương.");
        }

        scanner.close();
    }
}
