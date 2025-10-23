import java.util.Scanner;
public class PhuongThucLoiChao {
    public static void chaoTen(String ten) {
        System.out.println("Hello " + ten);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String ten = scanner.nextLine();

        chaoTen(ten);
    }
}