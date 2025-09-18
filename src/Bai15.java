import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên N: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn.");
        } else {
            System.out.println(n + " là số lẻ.");
        }

        scanner.close();
    }
}
