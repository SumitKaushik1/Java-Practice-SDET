public class SwapTwoStringWithOutThird {

    public static void main(String[] args) {
        String s1="sdet1";
        String s2="sdet2";
        s1=s1+s2;
        s2=s1.substring(0,(s1.length()-1)-(s2.length()-1));
        s1=s1.substring(s2.length());
        System.out.println(s1);
        System.out.println(s2);
    }
}
