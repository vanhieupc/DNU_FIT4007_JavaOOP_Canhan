import java.util.Scanner;
public class UocSoTuNhien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        // Nhập số nguyên dương N
        do {
            System.out.print("Nhập số nguyên dương N: ");
            N = sc.nextInt();
        } while (N <= 0);

        System.out.println("Các ước số tự nhiên của " + N + " là:");
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}