import java.util.Scanner;
public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        // Nhập số nguyên N
        System.out.print("Nhập số nguyên N: ");
        N = sc.nextInt();

        int demUoc = 0;

        // Dùng vòng lặp for để đếm số ước của N
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                demUoc++;
            }
        }

        if (N > 1 && demUoc == 2) {
            System.out.println(N + " là số nguyên tố.");
        } else {
            System.out.println(N + " không là số nguyên tố.");
        }

        sc.close();
    }
}