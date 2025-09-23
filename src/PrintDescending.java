import java.util.Scanner;

public class PrintDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen duong N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Vui long nhap so nguyen duong!");
        }
        else {
            for (int i = N; i >= 1; i--) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}