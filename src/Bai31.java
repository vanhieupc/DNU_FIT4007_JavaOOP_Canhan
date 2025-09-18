import java.util.Scanner;

public class Bai31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        System.out.print("Nhập phép tính (+, -, *, /, %): ");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a + " / " + b + " = " + ((double) a / b));
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0.");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.println(a + " % " + b + " = " + (a % b));
                } else {
                    System.out.println("Lỗi: Không thể chia lấy dư cho 0.");
                }
                break;
            default:
                System.out.println("Phép tính không hợp lệ.");
                break;
        }

        scanner.close();
    }
}
