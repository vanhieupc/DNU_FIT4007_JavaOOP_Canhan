public class PhuongThucTinhTich {
    // Phương thức tính tích
    public static int tinhTich(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;

        int ketQua = tinhTich(a, b, c);
        System.out.println("Tích của " + a + ", " + b + " và " + c + " là: " + ketQua);
    }
}