import java.util.Scanner;
public class TongBieuThuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        // Nhập số nguyên dương N
        do {
            System.out.print("Nhập số nguyên dương N: ");
            N = sc.nextInt();
        } while (N <= 0);

        int tong = 0;

        // Tính tổng bằng vòng lặp for
        for (int i = 1; i <= N; i++) {
            tong += i * (i + 1);
        }

        System.out.println("Tổng của biểu thức là: " + tong);
        sc.close();
    }
}