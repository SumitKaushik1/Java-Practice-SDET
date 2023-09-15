import java.util.Scanner;
import java.util.*;
public class ReversingNumber {



    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String  num = scan.nextLine();
    //like String s=String.valueOf(num);
    //   char[] charNum=s.toCharArray();
    char[] charNum=num.toCharArray();
    Stack<Character> s=new Stack<>();
    for(int i=0;i<charNum.length;i++){
        s.push(charNum[i]);
    }
    for(int i=0;i<charNum.length;i++){
        charNum[i]=s.pop();
    }
    //String.valueOf(charNum) will return string
    String  n=String.valueOf(charNum);

    System.out.println("reverse number:"+n);


    scan.close();
}


}
