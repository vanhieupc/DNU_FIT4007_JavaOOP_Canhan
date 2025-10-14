import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số phần tử:");
        int N = sc.nextInt();
        int[] a = new int[N];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Mảng theo thứ tự ngược lại:");
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(a[i]);
            if (i > 0) System.out.print(" ");
        }
    }
}