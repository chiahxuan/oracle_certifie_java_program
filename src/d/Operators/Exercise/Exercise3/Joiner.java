package d.Operators.Exercise.Exercise3;

import java.util.Locale;

public class Joiner {
    /*
    *
    *
    * Task: concatenate Strings
    * 		Option:
    * 			1) String.format()
    * 			2) String.concat()
    * 			3) String.join() // v8
    * 			4) +
    *
    * */

    public static void main(String[] args) {
        m1();
        m2("Chiah Xuan");
    }

    static void m1() {
        String hi = "Hi, ";
        String mom = "mom.";

        System.out.println( String.join("", hi, mom) ); //v8 - recommended!
        System.out.println( String.format("%s%s", hi, mom)  );
        System.out.println( hi.concat(mom) );
        System.out.println( hi + mom );
    }

    static String m2(String fullName){
        String initial ="";

        String[] token = fullName.split("\\s");
        StringBuilder sb = new StringBuilder();
        for(String n : token){
            sb.append(n.charAt(0));
        }
        initial = sb.toString().toUpperCase();
        return initial;
    }


}
