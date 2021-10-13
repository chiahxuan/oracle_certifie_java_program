package j.InterfaceDemo;

public class NewInterface{
    public static void main(String[] args) {
        Dummy dummy = new Dummy();
        dummy.m1();
        dummy.im1();
        dummy.im2();
    }
}

class Dummy implements MyNewInterface{
    //overridden methods
    @Override
    public void m1() {
        System.out.println("Dummy: overridden abstract method m1 here..");
    }

    //instance method
    void im1(){
        dm1();
    }

    void im2(){
        MyNewInterface.sm1();
    }
}

interface MyNewInterface {
    /*
    * default:
    *   - defining variable (public static final)
    *   - defining method/operations (public abstract)
    * */

    /*
    * New features:
    *   - default methods
    *   - static methods.
    * */

    //by default: public abstract m1();
    void m1();

    default void dm1(){
        System.out.println("New Interface: default method..");
    }

    static void sm1(){
        System.out.println("New Interface - static method..");
    }
}
