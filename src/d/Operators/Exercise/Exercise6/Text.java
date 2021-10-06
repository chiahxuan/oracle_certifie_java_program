package d.Operators.Exercise.Exercise6;

/*
* [9/30 3:40 PM]
Some Websites impose certain rules for passwords.  Write a method that checks whether a string is a valid password.  Suppose the password rule is as follows:
•   A password must have at least 7 characters.
•   A password consists of only letters and digits.
•   A password must contain at least one letter and at least one digit.
Write a program that prompts the user to enter a password and displays “Valid Password” if the rule is followed or “Invalid Password” otherwise.
* */

/*
    //+ checkPassword ( String ) : String
    //- checkLength (String) : boolean
    //- checkLetterOrDigit (String) : boolean
    //- oneLetter( String ) : boolean
    //- oneDigit ( String ) : boolean
* */

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        testTextPassword();
    }

    static void testTextPassword(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your password: ");
        String password = scan.next();
        if (Text.checkPassword(password) != null){
            System.out.println(">>> Valid Password");
        }else{
            System.out.println(">>> invalid Password");
        }
    }


    public static String checkPassword ( String password){
        boolean flag =
                checkLength(password) &&
                checkLetterOrDigit (password) &&
                oneLetter (password) &&
                oneDigit( password);
        return (flag) ? password : null;
    }

    //checkLength (String) : boolean
    private static boolean checkLength(String password){
        return (password.length()>=7);
    }

    //checkLetterOrDigit (String) : boolean
    private static boolean checkLetterOrDigit(String password){
        return (oneDigit(password)  && oneLetter(password));
    }

    //oneLetter (String) : boolean
    private static boolean oneLetter(String password){
        //check null value
        if(password == null){ return  false; }
        return  password.matches(".*[A-Za-z].*");
    }

    private static boolean oneLetter2(String pwd, int n){
        int numberOfLetters = 0;
        for (int i = 0; i < pwd.length(); i++) {
            if (Character.isLetter(pwd.charAt(i))) {
                numberOfLetters++;
            }
            if (numberOfLetters >= n) {
                return true;
            }
        }
        return false;
    }

    //oneDigit (String) : boolean
    private static boolean oneDigit(String password){
        return (password.matches(".*[0-9]*."));
//  equals to
// return (password.matches("[0-9]+"))? true : false;
    }

    private static boolean oneDigit(String pwd, int n){
        int numberOfDigit = 0;
        for (int i = 0; i < pwd.length(); i++) {
            if (Character.isLetter(pwd.charAt(i))) {
                numberOfDigit++;
            }
            //or
            int asciiValue = (int)pwd.charAt(i);
            if (asciiValue >= 48 && asciiValue <= 57){
                numberOfDigit++;
            }
        }
        return numberOfDigit>=1;
    }





}
