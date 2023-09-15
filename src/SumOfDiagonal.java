import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Create a Java program that allows the user to input  2D matrix
// and then computes and prints the sum of their Primary diagonal elements
public class SumOfDiagonal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        List<List<Integer>> matric=new ArrayList<>();
        int matriceSize=3;
        for(int i=0;i<matriceSize;i++)
            matric.add(new ArrayList());

        for(int i=0;i<matriceSize;i++)
            for(int j=0;j<matriceSize;j++)
                matric.get(i).add(scan.nextInt());

            int sum=0;
            for(int i=0;i<matriceSize;i++)
                for(int j=0;j<matriceSize;j++)
                    if(i==j)
                         sum+=matric.get(i).get(j);

                System.out.println(sum);


        scan.close();

    }
}
