import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckMail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //program to print numbers from 1 to 100;
        String str = "abcd#$fg@gmail.com";
        boolean decide = false;
        int i = 0;

        for( i = 0;i<str.length();i++) {
            Character c = str.charAt(i);
           // System.out.println(c);
           /* if(c == '@'){
                System.out.println(c);
            }*/
            if((Character.isLetter(c)) && (c == '@')) {
                decide = true;
            }
        }
        if(decide) {
            System.out.println(str);
        }

    }
}

