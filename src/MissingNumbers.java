import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class MissingNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
           int num=scan.nextInt();
                                  //0                             //
                                   //|                           //|
           //Integer a(stack) ->[Integer reference of Integer0],[Integer reference of Integer1]
           Integer []a=new Integer[num];
           for(int i=0;i<num;i++)
               a[i]=scan.nextInt();

           //List is of Integer so array should be of Integer
           List<Integer>l=new ArrayList<>(List.of(a));
           List<Integer>missing=new ArrayList<>();
           for(int i=0;i<num;i++){
               if(!l.contains(i))
                   missing.add(i);
           }

            System.out.println(missing);

        scan.close();
    }
}
