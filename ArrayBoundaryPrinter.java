import java.util.Scanner;

public class ArrayBoundaryPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        if (size > 0) {
            System.out.println("Phần tử đầu tiên: " + numbers[0]);
            System.out.println("Phần tử cuối cùng: " + numbers[size - 1]);
        } else {
            System.out.println("Mảng rỗng.");
        }

        scanner.close();
    }
}