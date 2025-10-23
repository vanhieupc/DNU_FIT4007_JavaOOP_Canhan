public class PhuongThucTinhDienTichTamGiac {

    public static double tinhDienTich(double a, double b, double c) {
        double p = (a + b + c) / 2; // nửa chu vi
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double a = 3, b = 4, c = 5;
        double dienTich = tinhDienTich(a, b, c);
        System.out.println("Diện tích tam giác là: " + dienTich);
    }
}