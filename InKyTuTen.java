import java.util.Scanner;
public class InKyTuTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập tên từ bàn phím
        System.out.print("Nhập tên của bạn: ");
        String ten = sc.nextLine();

        // In từng ký tự trên một dòng
        System.out.println("Các ký tự trong tên của bạn:");
        for (int i = 0; i < ten.length(); i++) {
            System.out.println(ten.charAt(i));
        }

        sc.close();
    }
}