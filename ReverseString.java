import java.util.Scanner;

public class ReverseString {
    public static String reverse(String str) {
        char[] temp = str.toCharArray();
        int l = temp.length;
        char[] rev = new char[l];
        for(int i=0; i<l; i++) {
            rev[i] = temp[l-i-1];
        }
        String strout = new String(rev);
        return strout;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(reverse(str));
    }
}
