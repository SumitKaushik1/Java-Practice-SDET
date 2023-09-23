import java.util.Arrays;

public class RemovingRegix {
    public static void main(String[] args) {
        String str="I like coding in Java.! I repeat I like coding in Java.!!";
        String regix1 = "[!\\\\\\\"#$%&'()*+,-./:;<=>?@/[\\\\\\\\\\\\\\\\/]^_`{|}~]";
        String [] strArray = str.split(regix1);

       /* int []a={1,2,3};
        System.out.println(a);*/

        String s1="";
        //you do concatination b/z you cannot do  String s3=String.valueOf(strArray);
        //        System.out.println(s3); directly it will show address
        //not string thats why concatination
        for(String s:strArray){
              s1=s1+s;//concatination ,in each new object is formed and assigened ot reference bz/ string
              //immutable
          }

        System.out.println(s1);

    }
}


/*
    String str="I like coding in Java.! I repeat I like coding in Java.!!";
    String [] strArray = str.split(" ");
        System.out.println("Original array String: " + Arrays.toString(strArray));
                for(int i=0;i<strArray.length;i++){
        String regex = "[!\\\"#$%&'()*+,-./:;<=>?@[\\\\\\\\]^_`{|}~]";
        if(strArray[i].matches(regex)){
        strArray[i]=strArray[i].replaceAll(regex,"");
        }

        }
        System.out.println("New array String: " + Arrays.toString(strArray));*/
