package f.ObjectOrientedProgramming.Basic.Inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Consultant c11 = new Consultant();
        c11.workload = 40;

    }
}

class Person{
    Person(){
        System.out.println("Constructing Person object...");
    }
}

//General Class
class Employee extends Person{
    double workload;
    Employee(){
        System.out.println("Constructing Employee object...");
    }
}

/*
* Consultant is an Employee
* Consultant is a Person
* */
class Consultant extends Employee{
    public Consultant() {
        System.out.println("Constructing Consultant object...");
    }
}