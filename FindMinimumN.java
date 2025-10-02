import java.util.Scanner;

public class FindMinimumN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào số nguyên dương S
        System.out.print("Nhập vào số nguyên dương S: ");
        int S = scanner.nextInt();

        int sum = 0;
        int N = 0;

        // Tìm N nhỏ nhất sao cho tổng từ 1 đến N >= S
        while (sum < S) {
            N++;
            sum += N;
        }

        // In ra kết quả
        System.out.println("Số nguyên dương N nhỏ nhất là: " + N);

        scanner.close();
    }
}