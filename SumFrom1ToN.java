public class SumFrom1ToN {
    public static void main(String[] args) {
        int N = 10; // Gán trực tiếp số nguyên dương N
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Tổng các số từ 1 đến " + N + " là: " + sum);
    }
}