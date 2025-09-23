import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương!");
        } else {
            for (int i = 1; i <= N; i++) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}