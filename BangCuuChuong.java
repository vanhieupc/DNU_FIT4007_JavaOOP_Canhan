import java.util.Scanner;
public class BangCuuChuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        // Nhập số nguyên dương N trong khoảng từ 1 đến 9
        do {
            System.out.print("Nhập số nguyên dương N (1 <= N <= 9): ");
            N = sc.nextInt();
        } while (N < 1 || N > 9);

        // In bảng cửu chương N
        System.out.println("Bảng cửu chương của " + N + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }

        sc.close();
    }
}