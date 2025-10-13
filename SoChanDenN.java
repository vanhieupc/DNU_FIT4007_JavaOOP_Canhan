public class SoChanDenN {
    public static void main(String[] args) {
        int N = 20; // Gán trực tiếp giá trị N

        System.out.println("Các số tự nhiên chẵn nhỏ hơn hoặc bằng " + N + " là:");

        for (int i = 2; i <= N; i += 2) {
            System.out.print(i + " ");
        }
    }
}