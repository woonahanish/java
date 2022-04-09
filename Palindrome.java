import java.util.Scanner;

public class Palindrome {
    public static boolean isAlpha(char c) {
        int i = (int)(c);
        if((65<=i&i<=90)||(97<=i&i<=122))
            return true;
        else
            return false;
    }
    public static int equivalent(char c) {
        int i = (int)(c);
        if(65<=i&i<=90)
            return i-64;
        else if(97<=i&i<=122)
            return i-96;
        else
            return -1;
    }
    public static boolean palindrome(String str) {
       char[] c = str.toCharArray();
       int l = c.length;
       int i = 0, j = l-1;
       while(i<j){
           while(!isAlpha(c[i])) {
                   i++;
           }
           while(!isAlpha(c[j])) {
                   j--;
           }
           if(equivalent(c[i])!=equivalent(c[j]))
               return false;
           i++;
           j--;
       }
       return true;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        boolean result = palindrome(str);
        System.out.println(result);
    }
}
