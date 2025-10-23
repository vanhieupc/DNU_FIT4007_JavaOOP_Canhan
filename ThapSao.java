import java.util.Scanner;
public class ThapSao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = scanner.nextInt();

        String dong = "";
        for (int i = 1; i <= N; i++) {
            dong += "*";
            System.out.println(dong);
        }
    }
}