import java.util.Arrays;

public class CountCapitalLetterStartingCapital {
    //1.String str = "I Am an Aspiring SDET with great Ambition" , find the
    //number of capital letters used and also print the words starting with capital letters

    public static void main(String[] args) {
        String str = "I Am an Aspiring SDET with great Ambition";
        // \s is for "space"  symbol  but compiler say tht it is escape sequence to tell compiler that take it as string
        // not as escape sequce we use extra \ sign ie escape the esca sequence .+ for more spaces
        String [] s1 = str.split("\\s+");
        String [] s2 = str.split("");
        //toCharArray() can also be used
        int count=0;
        //System.out.println(Arrays.toString(s1));
        for(String s:s2)
            if(Character.isUpperCase(s.charAt(0)))
                count++;
        System.out.println(count);


        for(String s:s1)
            if(Character.isUpperCase(s.charAt(0)))
                System.out.println(s);



    }



}
