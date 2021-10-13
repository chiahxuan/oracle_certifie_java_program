package g.IIB;

public class IIB {
    public static void main(String[] args) {
        Parent p1 = new Parent();
    }
}

class Parent{
    //variable
    //static variable - variable to the parent
    //

    static int i1;
    int i2;



    //instance block
    {
        System.out.println("Parent - instance block prints >>> " + i1);
    }


    //static block
    static {
        System.out.println("Parent - static block prints >>> " + i1);
        i1 = 999;
    }

    static {
//        System.out.println("Parent - static block prints >>> " + i2); // int not static
    }


    //Constructor
    Parent(){
        System.out.println("Parent - constructor");
    }
}
