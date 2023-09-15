import java.time.LocalDate;
import java.util.Scanner;

public class LengthOfMonth {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //format ->(year,month,day)
        System.out.println(LocalDate.of(scan.nextInt(),scan.nextInt(),scan.nextInt()).lengthOfMonth()); ;
        scan.close();
    }
}
