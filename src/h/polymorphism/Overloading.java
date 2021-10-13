package h.polymorphism;

public class Overloading {
    public static void main(String[] args) {
        SubOverloader sub = new SubOverloader();
        sub.m1();
        sub.m1("String 1");
        sub.m1("String 1", "String 2");
    }


}

class Overloader{

    //sample method
    int m1(){
        System.out.println("Overloaded - m1()");
        return 0;
    }

    //overloading m()
    int m1(String s){
        System.out.println("Overloaded m1(String");
        return 0;
    }
}

class SubOverloader extends Overloader{
    //overloading m(String, String)
    void m1(String s1, String s2){
        System.out.println("Overloaded m1(String, String)");
    }
}