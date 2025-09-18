import java.util.Scanner;

public class Bai21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương.");
        } else {
            double canBac2 = Math.sqrt(n);
            int phanNguyen = (int) canBac2;

            if (canBac2 == phanNguyen) {
                System.out.println(n + " là số chính phương.");
            } else {
                System.out.println(n + " không phải là số chính phương.");
            }
        }

        scanner.close();
    }
}
