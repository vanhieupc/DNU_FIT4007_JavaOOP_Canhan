import java.util.Scanner;

public class Bai24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ký tự chữ: ");
        char chu = scanner.next().charAt(0);

        if (chu >= 'A' && chu <= 'Z') {
            System.out.println(chu + " là chữ cái in hoa.");
        } else {
            System.out.println(chu + " không phải là chữ cái in hoa.");
        }

        scanner.close();
    }
}
