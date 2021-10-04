package b.DataType;

public class DataType {

    static class Sample{}
    public static void main(String[] args) {
        DataType dt = new DataType();
        dt.m2();

        /*
         * Instantiated objects come long with reference addresses
         * Note
         *      -
         *
         * */

        String s1 = new String("a");
        Double d1 = 99.0;
        System.out.println(s1); // a
        System.out.println(d1); // 99.0

        Sample sample = new Sample();
        System.out.println(sample);


    }

    void m1(){

        //primitive data type
        int i = 10; // mpm-objectdata type, just a memory-box named i1

        /*
         * Autobox vs unboxing
         * Note
         *      - Apply to the primitive and object data type
         *
         * */

        //with wrapper
        Integer i2 =10;

        /*
         * equivalent,
         *
         * Integer i2 = new Integer (10)
         * - This is because it's been autoboxed
         *
         * */

        // result = primitive + object
        int result = 10 + i2; // unbox


    }

    void m2(){
        int i1 = 100;
        Integer i2 = 200; //has object reference for i2
        Integer i3 = 200; //has object reference for i3
        Integer i4 = 100; //has object reference for i4

        System.out.println(i1==100);//true
        System.out.println(i2 == i3 );//false, == is comparing object references differing
        System.out.println( i2.equals(i3)); //true, .equals() is comparing values both has same value
        System.out.println(i1 == i4 );//true, autoboxing feature.

        Integer i5 = i3;
        System.out.println( i5 == i3 ); //true, i5 and i3 reference to the same object in heap

    }

    void m3(){
        StringBuilder sb = new StringBuilder(""); //object is referenced by sb
        sb.append("abc");
        sb.append("efg");
        sb.append(sb.toString());
    }

    void m4(){
        /*
        * Reference type: compile-time vs run time
        *
        *
        * */

        final class Local{}

        //compile-time
        Local local; // declare local object referencing variable at compile time.

        //run-time
        local = new Local(); // instantiating object of Local class at run-time, stay in heap memory

        //one-statement
        Local local2 = new Local();


    }

    void m5(){
        /*
        * casting
        * implicit-casting
        *       - byte > short > int > long > float > double
        * */

        int i = 32;
        long l = i; //this is AUTOMATIC implicit cast, you cast int into long, AUTOMATICALLY convert int into long

        /*
        * Explicit-casting
        * */
        double d = 99.9;
        float f = (float)d; //this is MANUALLY explicit-casted, possible loss of precision


    }
}
