public class RhombusTriangle {
    public static void main(String[] args) {
        int enterRows=25;


        //upper half rhombus
      int rows=2*enterRows;//14=rows

        for (int i = 1; i <= rows; i++) {
            // 7 enterRow then will make row 14,so 1st row will have 1 value ,2nd row 2 value ... son but we need
            // only odd number of values
            //1st row ->1 values
            //3rd row ->3 values
            // 5rd row ->5 values
            //........

            //i represent present row number
            //this condition will print only the odd rows eg 1st row ,3rd row ,5th,7th
            if(!(i%2==0)){
                //this forloop will print spacing of left till numbers donot start
                for (int j = 0; j <= rows- i; j++) {
                    System.out.print(" ");
                }

                //like row number is 3 so count/2 or 3/2 =1.5  ,1.5+1 , k is int so ,1 is saved as integer
                int k=(i/2)+1;
                //it will print only the number and spacing b.w them towards right
                int p=0;
                for (int j = 1; j <= i; j++) {
                    // The first value in a line is always 1
                    // for decreasing print k is printed
                    //if present valu(k) is greater than upcomming value ,then print k
                        if(k>(k-1) && k!=0)
                        {
                            System.out.print(k + " ");
                            k--;
                            p=k+2;
                            //k==0 ,k value stopped to 0 ,p value started from 2 in same row
                        }
                        //for increasing print p
                        //if present(p) value is smaller than upcomming value ,then  print p
                        else if(p<p+1){
                            System.out.print(p+" ");
                            p++;
                        }
                }
                System.out.println();
            }

        }


        //14 rows=upper half rhombus
        // lower half rhombus  12 rows needed


        //lower half rhombus
        //2*(7-1)
      int rows1=2*(enterRows-1);// 12 ,rows1


       //here change now rows that many but decreasing i ,rows number will be same for j  " " spacing needed in
        // decreasing so i started from row1
        for (int i = rows1; i >=1; i--) {

            //it is just to match to upper half  rhombus to put  extra one space from left (you can remove also then
            // it will be bent toward leftt)
            System.out.print(" ");

            // (7-1) =6=enterRow for lowerRhombus then will make row 12,so 1st row will have 1 value
            // ,2nd row 2 value ... son but we need
            // only odd number of values
            //1st row
            //3rd row
            // 5rd row
            //........

            //i represent row number
            //here numbers printed on the odd row,1,3,5
            if((!(i%2==0))){
                //since left spaces ie before number started needed in decreased form  first 1 space left,2 space left
                //3 spce left so on so j condtion must be rows1-i, ist iteration i=12,row1=12,so 12-12 ,
                // loop runs 1 time space left printed 1 time  , then 2 times ,3 times so on
                for (int j = 0; j <= rows1-i; j++) {
                    System.out.print(" ");
                }

                // below logic is same as above upper rhombus
                // k value should start from decreasig way so follows i just like in upper rhombus
                int k=(i/2)+1;

                int p=0;
                for (int j = 1; j <= i; j++) {
                    if(k>(k-1) && k!=0)
                    {
                        System.out.print(k + " ");
                        k--;
                        p=k+2;
                        //k==0 ,k value stopped to 0 ,p value started from 2 in same row
                    }
                    else if(p<p+1){
                        System.out.print(p+" ");
                        p++;
                    }

                }
                System.out.println();

            }


        }


    }

}
