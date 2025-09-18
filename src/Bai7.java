import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên N (có ít nhất 2 chữ số): ");
        int n = scanner.nextInt();

        if (Math.abs(n) < 10) {
            System.out.println("Lỗi: Số phải có ít nhất 2 chữ số (lớn hơn 9 hoặc nhỏ hơn -9).");
        } else {
            int chuSoGanCuoi = Math.abs((n / 10) % 10);
            System.out.println("Chữ số gần cuối của số " + n + " là: " + chuSoGanCuoi);
        }

        scanner.close();
    }
}
