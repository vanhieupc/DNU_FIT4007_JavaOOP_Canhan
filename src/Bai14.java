import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh thứ nhất: ");
        int canh1 = scanner.nextInt();

        System.out.print("Nhập cạnh thứ hai: ");
        int canh2 = scanner.nextInt();

        if (canh1 <= 0 || canh2 <= 0) {
            System.out.println("Cạnh phải là số nguyên dương.");
        } else if (canh1 == canh2) {
            System.out.println("Đây là hình vuông.");
        } else {
            System.out.println("Đây là hình chữ nhật, không phải hình vuông.");
        }

        scanner.close();
    }
}
