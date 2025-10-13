import java.util.Scanner;
public class TinhGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        do {
            System.out.print("Nhập số nguyên dương N: ");
            N = sc.nextInt();
        } while (N <= 0);

        long giaiThua = 1;

        for (int i = 1; i <= N; i++) {
            giaiThua *= i;
        }

        System.out.println(N + "! = " + giaiThua);
        sc.close();
    }
}