import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập góc thứ nhất (a): ");
        int a = scanner.nextInt();

        System.out.print("Nhập góc thứ hai (b): ");
        int b = scanner.nextInt();

        System.out.print("Nhập góc thứ ba (c): ");
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0 && (a + b + c == 180)) {
            System.out.println("Ba số " + a + ", " + b + ", " + c + " có thể là độ lớn 3 góc của một tam giác.");
        } else {
            System.out.println("Ba số " + a + ", " + b + ", " + c + " không thể là độ lớn 3 góc của một tam giác.");
        }

        scanner.close();
    }
}
