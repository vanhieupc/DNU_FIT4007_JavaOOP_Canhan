public class DemKyTuA {
    public static void main(String[] args) {
        String chuoi = "Java rat hay";
        int dem = 0;

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == 'a') {
                dem++;
            }
        }

        System.out.println("Số ký tự 'a' là: " + dem);
    }
}