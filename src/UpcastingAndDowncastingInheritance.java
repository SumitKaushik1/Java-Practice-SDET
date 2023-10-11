//file name class must be public 
class Person1{

    String name;
    String address;
//if constructors are added in this thne same type of constructors must be in the subclass inheritance
    //compiler confuse if not in the subclass employee object is made but in the employee class person class construtor is there
    //so only constructor make in teh employee not in the parent class

//constructors and setters and getters
}
class Employee1 extends Person1{

    String id ;

     Employee1(){
        this.id= "1";
    }
    String getId(){
        return this.id;
    }

}


public class UpcastingAndDowncastingInheritance {

    public static void main(String args[]){

        Person1 p=new Employee1();//upcasting

       // System.out.println(p.getId());//it will give compile time error compile intimate that Person class doesnot have id method
        System.out.println(((Employee1)p).getId());//here intimation to compiler that p reference holds the employee object

    }


}