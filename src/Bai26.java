import java.util.Scanner;

public class Bai26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi a: ");
        String a = scanner.nextLine();

        System.out.print("Nhập chuỗi b: ");
        String b = scanner.nextLine();

        if (a.length() >= b.length()) {
            System.out.println("Chuỗi dài hơn hoặc bằng là: " + a);
        } else {
            System.out.println("Chuỗi dài hơn là: " + b);
        }

        scanner.close();
    }
}
