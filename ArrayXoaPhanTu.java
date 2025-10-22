import java.util.Scanner;

public class ArrayXoaPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Nhập chỉ số cần xóa: ");
        int k = sc.nextInt();

        System.out.println("Mảng sau khi xóa phần tử tại chỉ số " + k + ":");
        for (int i = 0; i < n; i++) {
            if (i != k) {
                System.out.print(a[i] + " ");
            }
        }

        sc.close();
    }
}