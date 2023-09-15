import java.util.Map;
import java.util.TreeMap;

public class OccureancesOfCharactesMapCount {
    public static void main(String[] args) {

        String s="asdfsdggfgffghghghgdggfg";
        char[] c=s.toCharArray();
        Map<Character,Integer> m=new TreeMap<>();
        //Integer value bydeafuatl all nulll

        for(char c1:c){
            if(m.containsKey(c1))
                m.replace(c1,m.get(c1)+1);
                else
                    m.put(c1,1);

        }

        System.out.println(m);
    }
}
