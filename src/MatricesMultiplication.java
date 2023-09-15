import java.util.ArrayList;
import java.util.List;

public class MatricesMultiplication {
    public static void main(String[] args) {
        //list is the growable array ,firstly object is formed then only add values unlimited,
        List<List<Integer>> l=new ArrayList<>();
        //object for growable 2d array
        for(int i=0;i<3;i++)
            l.add(new ArrayList<Integer>());

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                //here you can use scanner to put values
                l.get(i).add(i+j);
        }

        //System.out.println(l);
        //list is the growable array ,firstly object is formed then only add values unlimited,
        List<List<Integer>> l1=new ArrayList<>();
        //object for growable 2d array
        for(int i=0;i<3;i++)
            l1.add(new ArrayList<Integer>());

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                //here you can use scanner to put values
                l1.get(i).add(i+j);
        }


        List<List<Integer>> l2=new ArrayList<>();
        //object for growable 2d array
        for(int i=0;i<3;i++)
            l2.add(new ArrayList<Integer>());

      for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
              int sum=0;
              for(int k=0;k<3;k++){
                  //for one row of one matrix multiply to other column of matrix , k should change and i can j
                  // must be static
                  sum+=(l.get(i).get(k)*l1.get(k).get(j));
              }
              l2.get(i).add(sum);
          }


      }





        System.out.println(l);
        System.out.println(l1);
        System.out.println(l2);
    }
}
