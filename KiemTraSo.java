public class KiemTraSo {
    public static void main(String[] args) {
        String chuoi = " Lập trình hướng đối tượng";

        if (chuoi.matches(".*\\d.*")) {
            System.out.println("Chuỗi có chứa ít nhất một ký tự số.");
        } else {
            System.out.println("Chuỗi không chứa ký tự số nào.");
        }
    }
}