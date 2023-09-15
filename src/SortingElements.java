import java.util.Arrays;

public class SortingElements {
    public static void main(String[] args) {

        //selection sort
        int a[]={10,9,5,1,2};
        //iteration
        for(int i=1;i<=a.length;i++){

            //max value is setting at last
            for(int j=0;j<a.length-i;j++){
                   if(a[j]>a[j+1]){
                       //swap
                       a[j]=a[j]+a[j+1];
                       a[j+1]=a[j]-a[j+1];
                       a[j]=a[j]-a[j+1];
                   }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
