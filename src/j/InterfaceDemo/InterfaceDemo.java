package j.InterfaceDemo;

import d.Operators.App;

public class InterfaceDemo {
    public InterfaceDemo(){

    }

    public static void main(String[] args) {
        //provide a view for external world via interface
        Updatable s1 = new Student();
        s1.edit();
        // s1.getName(); // not possible because it's not viewable operation in the interface

        Comparable s2 = new Student();
        s2.compareTo(s1);

//        Cloneable s3 = new Student();
//        s3.clone(s2);
//        try {
//            Object cloneObj = ((Student)s3).clone();
//        }catch(Exception e){
//
//        }
    }
}

class Person{
    String name;
}


/*
* Student is a Object;
* Student is a Person;
* Student is a Updatable object
* Student is a Comparable object
* Student is a Cloneable object
*
*
* */
class Student extends Person implements Updatable, Comparable, Cloneable{
    @Override
    public void edit() {
        //code to modify student record;
        System.out.println("Student is modifying the profile");
    }

    public String getName(){
        return super.name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class StudentRecord implements Appendable{

    @Override
    public void append() {

    }

    @Override
    public void edit() {

    }

}

interface Deletable{

}


//Appendable is a subtype of Updatable
interface Appendable extends Updatable{
    void append();
}


interface Updatable  {
    /*
    * Variables
    * by default, public static final
    * */
    int count = 0;
//    public static int samPleOriginal = 0; //same

    /*
    * Methods
    * by default, public abstract
    * */

    void edit();
//    public abstract void samPleOriginal(); //same

}
