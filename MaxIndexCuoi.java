import java.util.Scanner;

public class MaxIndexCuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            } else if (a[i] == max) {
                index = i; // cập nhật chỉ số cuối cùng
            }
        }

        System.out.println("Giá trị lớn nhất là: " + max);
        System.out.println("Chỉ số của phần tử lớn nhất cuối cùng là: " + index);

        sc.close();
    }
}