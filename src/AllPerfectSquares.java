import java.util.*;

public class AllPerfectSquares {
    public static void main(String[] args) {
               Map<Integer,Integer>m =new HashMap<>();
       // Set(interface) is just like dynamic array and it doesnot allow the dublicate values
        //LinkedHashSet class for ordered and unsorted set
        Set<Double> s=new LinkedHashSet<>();
        int i=1;
        while(i<=100)
        {

            double perfectSquare=Math.pow(i,2);

            if(perfectSquare<=100)
                s.add(perfectSquare);
            ++i;

        }


        //it will call the toString() of set
        System.out.println(s);

    }


}
