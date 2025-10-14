import java.util.Scanner;
public class Mang {
    public static void main(String[] args) {
        int[] a = new int[5];            // Khai báo mảng 5 phần tử
        Scanner sc = new Scanner(System.in);

        // Nhập mảng từ bàn phím
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // In ra mảng trên một dòng, giữa các phần tử có dấu cách
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}