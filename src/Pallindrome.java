import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String original = scan.nextLine();
        char[] s1 = original.toCharArray();

        Stack<Character> s2 = new Stack<>();
        for (char c : s1)
            s2.push(c);

        char[] s3 = new char[s1.length];
        for (int i = 0; i < s1.length; i++) {
            s3[i] = s2.pop();
        }

        String reverse = String.valueOf(s3);
        if (reverse.equals(original))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        scan.close();
    }
}
