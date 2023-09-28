import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LCMAndGCD {
    public static void main(String[] args) {
              int n1 =64;
              int n2= 86;
              int product=64*86;
              List<Integer> l=new ArrayList<>();
              List<Integer> l2=new ArrayList<>();
              TreeSet<Integer> s=new TreeSet<>();

              //find hcf is easy to find
              for(int i=2;i<64;i++)
                  if(64%i==0)
                      l.add(i);
             for(int i=2;i<64;i++)
                 if(86%i==0)
                    l2.add(i);

             for(int i=0;i<l.size();i++) {
                 int n = l.get(i);
                 if (l2.contains(n))
                     s.add(n);
             }
       // System.out.println(s);
        // s.pollLast() remove the  highest element and return the element
        int hcf=s.pollLast();
        System.out.println(("HCF:"+hcf));
        System.out.println("LCM"+product/hcf);

    }
}
