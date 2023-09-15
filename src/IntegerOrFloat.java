import java.util.Scanner;

public class IntegerOrFloat {
 /*   public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       if(scan.hasNextInt())
            System.out.println("Integer");
          else if(scan.hasNextFloat())
                System.out.println("Float");
        scan.close();

    }*/



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String to check: ");
        String input = scanner.nextLine();

        if (isValidInteger(input)) {
            System.out.println(input + " is a valid Integer");
        } else if (isValidFloat(input)) {
            System.out.println(input + " is a valid Float");
        } else {
            System.out.println(input + " is not a valid number!, Please try again");
        }
    }

    // Function to check if a string is a valid integer
    public static boolean isValidInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Function to check if a string is a valid floating number
    public static boolean isValidFloat(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

