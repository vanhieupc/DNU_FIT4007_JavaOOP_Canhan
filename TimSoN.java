import java.util.Scanner;
public class TimSoN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên dương S: ");
        int S = scanner.nextInt();

        int tong = 0;
        int N = 0;

        for (int i = 1; ; i++) {
            tong += i;
            if (tong > S) {
                N = i - 1;
                break;
            }
        }

        System.out.println("Số nguyên dương N nhỏ nhất sao cho 1 + 2 + ... + N ≤ " + S + " là: " + N);

        scanner.close();
    }
}