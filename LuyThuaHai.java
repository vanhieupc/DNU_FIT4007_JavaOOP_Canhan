import java.util.Scanner;
public class LuyThuaHai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        do {
            System.out.print("Nhập số nguyên dương N: ");
            N = sc.nextInt();
        } while (N <= 0);

        boolean laLuyThua = false;

        for (int i = 1; i <= N; i *= 2) {
            if (i == N) {
                laLuyThua = true;
                break;
            }
        }

        System.out.println(N + (laLuyThua ? " là" : " không là") + " lũy thừa của 2.");
        sc.close();
    }
}