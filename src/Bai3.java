import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập chiều dài
        System.out.print("Nhập chiều dài: ");
        double dai = sc.nextDouble();

        // Nhập chiều rộng
        System.out.print("Nhập chiều rộng: ");
        double rong = sc.nextDouble();

        // Tính chu vi và diện tích
        double chuVi = 2 * (dai + rong);
        double dienTich = dai * rong;

        // In kết quả
        System.out.println("Chu vi hình chữ nhật = " + chuVi);
        System.out.println("Diện tích hình chữ nhật = " + dienTich);

        sc.close();
    }
}
