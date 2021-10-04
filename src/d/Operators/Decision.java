package d.Operators;

public class Decision {
    void m1(){
        boolean b = true;

        //1 statement only, braces can be omitted, more than 1 tha braces are mandatory
        if( b == true )
            System.out.println("1 statement only, braces can be omitted, more than 1 tha braces are mandatory");

        //bad example: first statement will run only
        if( b == true )
            System.out.println("First statement");
            System.out.println("Second statement");

    }

    void m2(){
        //syntax for switch case
        int n =2;
        switch(n){

            case 1:
                //code
                break;
            case 2:
                //code
                break;
            default:
                //code
        }
    }
}
