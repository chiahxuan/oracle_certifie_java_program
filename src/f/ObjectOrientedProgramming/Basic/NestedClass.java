package f.ObjectOrientedProgramming.Basic;

public class NestedClass {
    public static void main(String[] args) {
        /*
        * Instantiate the OuterClass for InnerClass
        * */
        OuterClass outer = new OuterClass(); // OuterClass object instance
        OuterClass.InnerClass inner = outer.new InnerClass();// InnerClass object instance

        inner.showInner();
        outer.m(); // Internally, calling object of Local Class's method


        //Need not instantiation of OuterClass for static nested class
        OuterClass.StaticNestedClass staticClass = new OuterClass.StaticNestedClass();
        staticClass.showStaticNested();

    }
}

class OuterClass{

    //data member (instance variables)
    int i;
    String s = "OUTER KEKE";
    double d;

    class InnerClass{
        String s = "INNER KEKE";

        void showInner(){
            System.out.println("InnerClass - showInner()...");
            System.out.println("InnerClass - showInner() s variable..." + s); // show inner's s
            System.out.println("InnerClass - showInner() s variable..." + this.s); // show inner's s
            System.out.println("InnerClass - showInner() s variable..." + OuterClass.this.s); // show outer's s

        }
    }

    static class StaticNestedClass{
        void showStaticNested(){
            System.out.println("StaticNestedClass - showStaticNested()..");
//            System.out.println(s); // ERROR
        }
    }


    //instance methods
    void m(){
        System.out.println("Outer Class - m()...");

        class LocalClass{
            void showLocal(){
                System.out.println("Local - showLocal()...");
            }
        }

        //invoke showLocal
        LocalClass local = new LocalClass();
        local.showLocal();


    }




}
