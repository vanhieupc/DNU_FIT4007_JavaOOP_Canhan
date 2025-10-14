import java.util.Scanner;
public class SumEvenAtOddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử: ");
        int N = sc.nextInt();
        int[] a = new int[N];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;
        System.out.println("Các phần tử chẵn ở chỉ số lẻ:");
        for (int i = 1; i < N; i += 2) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                sum += a[i];
            }
        }

        System.out.println("Tổng các phần tử đó là: " + sum);
    }
}