import java.util.Scanner;
public class TongChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        // Nhập số tự nhiên N
        do {
            System.out.print("Nhập số tự nhiên N: ");
            N = sc.nextInt();
        } while (N < 0); // Cho phép N = 0

        int tong = 0;

        // Dùng vòng lặp for để tính tổng các chữ số
        for (int temp = N; temp > 0; temp /= 10) {
            tong += temp % 10;
        }

        System.out.println("Tổng các chữ số của " + N + " là: " + tong);
        sc.close();
    }
}