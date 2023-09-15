public class SwapTwoIntegerWithoutThird {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
