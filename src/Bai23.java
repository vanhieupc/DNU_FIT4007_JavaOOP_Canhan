import java.util.Scanner;

public class Bai23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ký tự chữ: ");
        char chu = scanner.next().charAt(0);

        if (chu >= 'a' && chu <= 'z') {
            System.out.println(chu + " là chữ cái in thường.");
        } else {
            System.out.println(chu + " không phải là chữ cái in thường.");
        }

        scanner.close();
    }
}
