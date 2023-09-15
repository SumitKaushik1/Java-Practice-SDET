public class PriortyOfDatatypeShortBeforeInt {

    public static void main(String[] args) {
        for (short i = 1; i <= 10; i++)
            doSomething(i);
    }

    public static void doSomething(int input) {
        System.out.println(input);
    }

    public static void doSomething(short input) {
        System.out.println(input*input);
    }



}

/*public class MethodHideStaticMethod extends MethodHidingStaticSquareOfNumber{
    public static void doSomething(int input) {
        System.out.println(input*input);
    }
}*/


