import java.util.Stack;

public class CheckBalanceParenthesis {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();

        String s1 = "[()(){()}]";//balance parenthesis each has corresponding closed parnetheis
        String s2 = "[{]}()";//unbalance  [{   after this square bracket ] is comming instead } close curly braces must
        // be there , it is child parenthesis must be closed first
        boolean  flag= true;//bydefault considered balanced

        char[] c1 = s2.toCharArray();


      forLoop:
        for (int i = 0; i < c1.length; i++) {
            char c=c1[i];

            //put open parenthesis in stack only
            if (c == '{' || c == '(' || c == '[') {

                s.push(c);
                continue;
            }

            // after open parenthesis if no closed parenthesis , it is unbalance
            if(s.empty()){
                flag=false;
                break;//it will break forloop
            }



            switch (c){

                case ')' :
                       char c2=s.pop();
                       //pop out parenthesis must be correponding open  '(' not below mentioned otherwise unbalance
                       if(c2 =='[' || c2 == '{'){
                           flag=false;
                           break forLoop;//it will break forloop
                       }

                    break;//it will break switch

                case ']' :
                    //pop out parenthesis must be corresponding open  '[' not below mentioned otherwise unbalance
                    char c3=s.pop();
                    if(c3 =='(' || c3 == '{'){
                        flag=false;
                        break forLoop;//it will break forloop
                    }

                    break;//it will break switch

                case '}' :
                    char c4=s.pop();
                    //pop out parenthesis must be  corresponding opened '{' not below mentioned otherwise unbalance
                    if(c4 =='[' || c4 == '('){
                        flag=false;
                        break forLoop;//it will break forloop
                    }

                    break;//it will break switch

            }
        }


          //at last if the stack is empty ie each open has its closed parenthesis ,flag remain true,if some parenthesis remained then automaically
        // it is not balanced flag is false

        if(flag)
            System.out.println("balance");
        else
            System.out.println("unbalance");


    }

    }

