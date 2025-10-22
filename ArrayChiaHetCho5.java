import java.util.Scanner;

public class ArrayChiaHetCho5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean co = false;
        System.out.println("Các số chia hết cho 5 là:");
        for (int i = 0; i < n; i++) {
            if (a[i] % 5 == 0) {
                System.out.println(a[i]);
                co = true;
            }
        }

        if (!co) {
            System.out.println("Không tồn tại phần tử nào chia hết cho 5.");
        }

        sc.close();
    }
}