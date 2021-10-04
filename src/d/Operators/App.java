package d.Operators;

public class App {
    public static void main(String[] args) {

        int id = 123456;
        Employee e1 = new Employee();
        e1.setEmpID(id);

        Employee e2 = new Employee();
        e2.setEmpID(id);

        //compare object
        System.out.println(e1.equals(e2));

        //compare references
        System.out.println(e1 == e2);
    }
}
