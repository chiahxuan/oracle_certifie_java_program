package i.abstractDemo;

public class AbstractDemo {
    public AbstractDemo(){
        //TOFO Auto-generated constructor stub
    }

    public static void main(String[] args) {

    }
}

abstract class Employee{
    /*
     * abstract method
     * calSalary(): void
     * */

    public abstract void calSalary();

    String name;
    String address;

    public String getADdress(){
        return this.address;
    }
}


class Constructor extends Employee{

    @Override
    public void calSalary(){

    }
}
class FullTimeEmployee extends Employee{
    @Override
    public void calSalary(){

    }
}