import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b (khác 0): ");
        int b = scanner.nextInt();

        if (b == 0) {
            System.out.println("Lỗi: b phải khác 0.");
        } else {
            double ketQua = (double) a / b;
            System.out.println(a + " / " + b + " = " + ketQua);
        }

        scanner.close();
    }
}
