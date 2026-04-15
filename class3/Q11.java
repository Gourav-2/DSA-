package class3;

public class Q11 {
    static String reverse(String str) {
        if (str.length() == 0) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "gourav";
        System.out.println(reverse(str));
    }
    
}
