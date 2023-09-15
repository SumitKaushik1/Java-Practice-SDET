import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        // num to string
        String numString = String.valueOf(num);
        //string to array
        char[] charNum = numString.toCharArray();
        int i = 0;
        int count = 0;
        double sum = 0;

        //loop to remove initial zeros  000153= 153
        while (charNum[i] == '0') {

            ++i;
        }

        //count number of digits
        for (int j = i; j < charNum.length; j++) {
            count++;
        }



        for (char c : charNum) {

            //convert character to string
           String charString=String.valueOf(c);

           //Integer.valueOf(it takes only string it takes not characters)
           int digit = Integer.valueOf(charString);



            sum = sum + Math.pow(digit, count);
        }

        if (sum == num)
            System.out.println("ArmStrong Number:"+sum);
        else
            System.out.println("Not a ArmStrong Number:"+sum);

        scan.close();
    }
}