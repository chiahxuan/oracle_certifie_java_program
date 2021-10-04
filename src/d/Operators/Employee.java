package d.Operators;

public class Employee extends Object{

    private int empID;

    public int getEmpID(){
        return empID;
    }

    public void setEmpID(int empID){
        this.empID = empID;
    }

    /*
    *   REQ: Compare employee objects by the employeeID
    *
    *
    * */

    @Override
    public boolean equals(Object another){
        boolean result = false;

        if(another instanceof Employee){
            Employee anotherEmpObj = (Employee) another; //casting? implicit or explicit --> Explicit-casting (down casting)
            if(anotherEmpObj.getEmpID() == this.getEmpID()){
                result = true;
            }
        }
        return result;
    }



}
