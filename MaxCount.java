import java.util.Scanner;

public class MaxCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0], count = 1;

        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                count = 1;
            } else if (a[i] == max) {
                count++;
            }
        }

        System.out.println("Giá trị lớn nhất: " + max);
        System.out.println("Số lượng phần tử có giá trị " + max + " là: " + count);

        sc.close();
    }
}