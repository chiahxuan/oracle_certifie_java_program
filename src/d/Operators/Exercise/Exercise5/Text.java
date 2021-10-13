package d.Operators.Exercise.Exercise5;

/*
*
Write a program that prompts the user to enter a string and then displays the string modified as follows:
•   Convert all the characters in the string to uppercase
•   Replace all the vowels with the lowercase letter ‘x’
Here is a sample run of the program:
    Enter a string: The quick brown fox jumps over the lazy dog
    Modified string: THx QxxCK BRxWN FxX JxMPS xVxR THx LxZY DxG
* */

import java.util.Scanner;

public class Text {

    public static void main(String[] args) {
        testTextReplacement();
    }

    static void testTextReplacement(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String line = scan.nextLine();
        System.out.println("Modified string "+ Text.parseLine(line) );


    }
    //parseLine(String) : String
    public static String parseLine(String dataLine){
        String vowels = "[AEIOUaeiou]";
        String replacement = "x";
        return replaceWith(toUpper(dataLine), vowels, replacement);
    }

    /*
    * Supporting method functions for the exposed services/methods.
    * These method functions are encapsulated in the class.
    * */


    //toUpper() : String
    private static String toUpper(String line ){
        return line.toUpperCase();
    }

    //replaceWith(String, String) : String
    private static String replaceWith(String line, String chars, String replacement ){
        //replaceAll(String regex, String replacement)
        return line.replaceAll(chars, replacement);
    }
}
