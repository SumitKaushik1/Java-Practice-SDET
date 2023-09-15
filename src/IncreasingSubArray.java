import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IncreasingSubArray {


    public static void main(String[] args) {
        int[] a= { 1, 2, 3, 1, 2, 3, 4, 5, 6, 7, 2, 3, 4, 5, 6 };

        System.out.println(Arrays.toString(a));

        List<List<Integer>>l=new ArrayList<>();
        int listNumber=0;
        l.add(new ArrayList<>());

        l.get(listNumber).add(a[0]);
        for(int i=1;i<a.length-1;i++){
            if((a[i-1]+1)==a[i])
                //if it is increasing add in same list
                l.get(listNumber).add(a[i]);
            else
            {
                // if it is not increasing create new list and  start adding in that
                l.add(new ArrayList<>());
                listNumber++;
                l.get(listNumber).add(a[i]);
            }


        }
         int maxLength=-1;
        List<Integer>l2=null;
        for(List<Integer> l1:l){
            if(l1.size()>maxLength){
                maxLength=l1.size();
                l2=l1;
            }
        }


        System.out.println(l2+": maxLength"+maxLength);

    }
}
