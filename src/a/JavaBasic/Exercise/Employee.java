package a.JavaBasic.Exercise;


// QUESTION: What is the parent class of the Employee?
// ANSWER: "Object" Class. Check the object from Oracle documentation. Any Class YOU created is the child class in "Object" class
// public class Employee extends Object{}
public class Employee {

    //Encapsulation -> private modifier
    private String name;
    private double salary;

    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /* IMPORTANT NOTES
     * create a constructor
     *
     * Constructor - a method that creates/makes/instantiates/construct an object instance whenever the new keyword is triggered
     *
     * Syntax:
     * modifier constructorName (input params){}
     *
     * Exam Tips: ** IMPORTANT
     * JavaFileName = ClassName = ConstructorName
     *
     * Default Constructor is implicitly given by the compiler if not specified
     *      NON-ARGUMENT CONSTRUCTOR / default-Constructor
     *      public Employee(){}
     *
     * However, if there are non-default constructor provided, so we are mandatory to explicitly write non-args constructor
     *
     * THIS keyword -
     *      Context 1. In general, it is used to refer to the current object instance.
     *      Context 2. In constructor, this is it used to refer the marching constructor method.
     *
     * SUPER keyword -
     *      - implicit/explicit
     *      - invoke the parent constructor
     *
     * Significantly, the very first statement in a constructor is either super() or this()
     *
     * implicit - code-hidden hidden in a way Compiler insert on-behalf
     * explicit - visible in a way Programmer writes it
     *
     * - OVERLOADED CONSTRUCTOR, DEFAULT / NON-ARG CONSTRUCTOR
     * - usage of "THIS" keyword, 2 contexts
     *
     *
     *
     *
     *
     *
     * */

    //NON-ARGS CONSTRUCTOR
    public Employee(){
        super();
    }

    //OVERLOADED CONSTRUCTOR
    public Employee (String employeeName){
        super();
        this.name = employeeName;
        this.salary = 0.0;
    }

    //default modifier is default private
    //OVERLOADED CONSTRUCTOR
    public Employee(String employeeName, double currentSalary)   {

        /*
        *
        * QUESTION: why cannot put super() here?
        * ANSWER: you cannot but this() and super() at the same time.
        *
        * 02.04.30 - time revise this
        * this(employeeName) -> Employee (String employeeName) -> Object() -> following
        *
        * */
        // super();
        this(employeeName); //(context 2) - find and match other constructor method to invoke.
        this.salary = currentSalary; //(Context 1)
    }


    public void raiseSalary(double percent){
        salary = salary + (salary * percent / 100.0);
    }


    public static void main(String[] args) {
        testEmployee();
    }

    static void testEmployee() {
        //Employee is instantiated with default-constructor
        Employee em1 = new Employee(); //object is instantiated with default-constructor
        Employee em2 = new Employee("John", 2500); //object is instantiated with overloaded-constructor
        Employee em3 = new Employee("Ali"); //object is instantiated with overloaded-constructor


        em3.setSalary(5000);

        //ternary-operator - shorthand for if-else
        Employee highSalaried = (em2.getSalary() > em3.getSalary() )
                ? em2
                : em3;
        System.out.println("High salaried employee: " + highSalaried.getName());
        System.out.println("Total Salary: " + (em2.getSalary() + em3.getSalary()));


    }
}
