import java.util.Scanner;

public class Bai27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giờ (0 <= h < 24): ");
        int h = scanner.nextInt();

        System.out.print("Nhập phút (0 <= m < 60): ");
        int m = scanner.nextInt();

        // Tăng phút lên 1
        m += 1;

        // Nếu phút bằng 60 thì reset phút về 0 và tăng giờ lên 1
        if (m == 60) {
            m = 0;
            h += 1;
            // Nếu giờ bằng 24 thì reset về 0
            if (h == 24) {
                h = 0;
            }
        }

        System.out.printf("Thời gian sau 1 phút nữa là %02d:%02d\n", h, m);

        scanner.close();
    }
}
