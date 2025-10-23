public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello";
        String reversed = reverse(input);
        System.out.println("Chuỗi ban đầu: " + input);
        System.out.println("Chuỗi đảo ngược: " + reversed);
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}