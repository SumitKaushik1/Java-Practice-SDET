import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CountLetters {
    public static void main(String[] args) {


        String s = "i stay in Maharashtra&&&$$$";
        char[] s1 = s.toCharArray();
        List<Character> l = new ArrayList<>();
        for (Character c : s1)
            if (Character.isLetter(c))
                l.add(c);

        System.out.println(l);
        System.out.println(l.size());
    }




}
