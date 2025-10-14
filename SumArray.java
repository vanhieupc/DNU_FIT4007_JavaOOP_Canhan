import java.util.Scanner;
public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số phần tử:");
        int N = sc.nextInt();
        int[] a = new int[N];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += a[i];
        }

        System.out.println("Tổng các phần tử trong mảng là: " + sum);
    }
}