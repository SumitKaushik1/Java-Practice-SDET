public class Prime {
    public static void main(String[] args) {
        int countPrime=0;

        // 1 is not a prime number
        //so number starts from 2=i
        for(int i=2;i<=50;i++){
            int count=1;// to count factors of i
            for(int j=2;j<=i;j++)
          {
                 if(i%j==0){
                     count++;
                     //if factors of i greater than 2( 1 and itself ) than it is not prime , and it is composite
                     //break the loop ,print composite number
                     if(count>2)
                         break;
                 }


          }
            //if factors of i are 2 (1 and itself ) then it is prime,count number of prime numbers
            if(count==2)
                countPrime++;
            else
                System.out.println(i);


       }
        System.out.println("number of Prime"+countPrime);
    }

}
