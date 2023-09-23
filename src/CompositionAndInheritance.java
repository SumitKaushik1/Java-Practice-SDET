class  Animal {
    //no specifier within package
    //protected within and outside package
    //composition(strongly coupled, parent has object of child)
    Dog d;

    Animal() {
    }

    public Animal(Dog d) {
        this.d = d;
    }


    void sound() {
        d.boo();
    }


}

class Dog extends Animal {
//inheritance child inherit parent

    //child has to get the same constructors as the parent
    Dog(){}
    Dog(Dog d ){
        super(d);

    }
    void boo(){
        System.out.println("boo");
    }
};
public class CompositionAndInheritance {
    // main class can only be public
    public static void main(String[] args) {
        Dog d=new Dog();
         Animal a= new Animal(d);
           a.sound();
    }

}



