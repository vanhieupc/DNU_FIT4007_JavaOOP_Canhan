import java.util.Scanner;

public class KiemTraMangKhongGiam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean khongGiam = true;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                khongGiam = false;
                break;
            }
        }

        if (khongGiam) {
            System.out.println("Mảng là mảng không giảm.");
        } else {
            System.out.println("Mảng không phải là mảng không giảm.");
        }

        sc.close();
    }
}