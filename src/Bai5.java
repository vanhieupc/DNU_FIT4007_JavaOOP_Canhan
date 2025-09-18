import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tuổi của sinh viên tính đến năm 2023: ");
        int tuoi = scanner.nextInt();

        int namSinh = 2023 - tuoi;

        System.out.println("Năm sinh của sinh viên là: " + namSinh);

        scanner.close();
    }
}
