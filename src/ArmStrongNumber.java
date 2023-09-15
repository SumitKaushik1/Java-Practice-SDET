import java.util.Arrays;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int n=153;//if it is integer only
        double sum=0;
        int digit=0;
        String toStore="";
          String n1=String.valueOf(n);
            char[] s1=n1.toCharArray();
        //System.out.println(Arrays.toString(s1));
          int countDigits=s1.length;
          for(int i=0;i<countDigits;i++){
                  toStore=String.valueOf(s1[i]);

                  //Intger.valueOf(String/int);
                  digit=Integer.valueOf(toStore);


              sum+=Math.pow(digit,countDigits);
          }
        System.out.println(sum);
          if(sum==n)
        System.out.println("ArmStrongNumber");
          else
              System.out.println("Not ArmStrongNumber");

    }
}
