public class Pascal_Triangle {
    public static void main(String[] args) {
        int rows=5;

        for (int i = 1; i <= rows; i++) {

            //this forloop will print spacing of left
            for (int j = 0; j <= rows- i; j++) {
                System.out.print(" ");
            }

            //it will print only the number and spacing b.w them towards right
            int k=1;
            for (int j = 1; j <= i; j++) {

                // The first value in a line is always 1
                System.out.print(k + " ");
                k = k * (i - j) / j;


            }
            System.out.println();
        }
    }
}
