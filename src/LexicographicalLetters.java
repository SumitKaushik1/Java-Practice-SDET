import java.util.*;

public class LexicographicalLetters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char[] charArray=scan.nextLine().toCharArray();


        //to remove dublicates and sort
        Set<Character> lexicographicalCharacter=new TreeSet<>();
        for(int i=0;i<charArray.length;i++){
            lexicographicalCharacter.add(charArray[i]);
        }
        //Set has no index to get values so converted into linkedlist ->same order and get values
        List <Character> l= new LinkedList<>(lexicographicalCharacter);

       for(int i=0;i<charArray.length;i++){
           if(i<l.size())
               charArray[i]=l.get(i);
           else
              charArray[i]=' ';
       }

       //it has its own toString method
        System.out.println(charArray);



        //Set does not have fixed index so convert to list to get values , linkedlist for same order
        // System.out.println(Arrays.toString(charArray));
        //.of ->for array ,values
        // new Collection_name<>(Collection_name);
      /*  Character[] c=new Character[charArray.length];
        int i=0;
        for(Character c1:charArray){
            c[i]=c1;
          i++;
        }*/

        //System.out.println(Arrays.toString(c));

        //Set.of(c) cannot take dublicate value you ,treemap can take dublicate value and sort that
        //String.valueOf() will only convert into String format but print like their respective toString
        //each has their respective toString no need ot convert into valueOf()
        // System.out.println(String.valueOf(l));
        //System.out.println(String.valueOf(charArray));



        // System.out.println(lexicographicalCharacter);






        scan.close();
    }
}
