public class DemSoTu {
    public static void main(String[] args) {
        String chuoi = "Java là ngôn ngữ mạnh mẽ";

        String[] tu = chuoi.trim().split(" ");

        // In ra số từ
        System.out.println("Số từ trong chuỗi là: " + tu.length);
    }
}