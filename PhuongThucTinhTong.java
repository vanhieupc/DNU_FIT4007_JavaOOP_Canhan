public class PhuongThucTinhTong {
    public static int tinhTong(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int so1 = 5;
        int so2 = 7;
        int tong = tinhTong(so1, so2);
        System.out.println("Tổng của " + so1 + " và " + so2 + " là: " + tong);
    }
}