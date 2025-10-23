public class KiemTraDoiXung {
    public static void main(String[] args) {
        String chuoi = "racecar";
        String daoNguoc = "";

        for (int i = chuoi.length() - 1; i >= 0; i--) {
            daoNguoc += chuoi.charAt(i);
        }

        if (chuoi.equals(daoNguoc)) {
            System.out.println("Chuỗi \"" + chuoi + "\" là chuỗi đối xứng.");
        } else {
            System.out.println("Chuỗi \"" + chuoi + "\" không phải là chuỗi đối xứng.");
        }
    }
}