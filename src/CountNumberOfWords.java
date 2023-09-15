import java.util.ArrayList;
import java.util.List;

public class CountNumberOfWords {

//String str = "i am an asprining SDET " - find number of words are in this string
    public static void main(String[] args) {
        String s = "i am an asprining SDET";
        String [] s1 = s.split(" ");
        System.out.println(s1.length);
    }

}
