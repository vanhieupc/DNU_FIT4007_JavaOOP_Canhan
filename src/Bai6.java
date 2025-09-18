import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên N: ");
        int n = scanner.nextInt();

        int chuSoCuoi = Math.abs(n % 10);

        System.out.println("Chữ số cuối cùng của số " + n + " là: " + chuSoCuoi);

        scanner.close();
    }
}
