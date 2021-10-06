package d.Operators.Exercise.Exercise4;

import java.util.Scanner;

/*
    Write a method that finds the number of occurrences of a specified character in a string using the following header:
    public static int countLetter(String str, char ch)

    Write  a test program that prompts the user to enter a word and a letter of the alphabet.  The program should then count and display the number of occurrences of the letter in the word.  A sample dialog for the program is shown below:
    Enter a word: happy
    Enter the letter you want to count: p
    happy contains 2p
*
* */
public class Text {

    public static int countLetter(String str, char ch){
        int count =0;
        //for each char of the string
        //if ch = char
        int length = str.length();
        for(int i =0; i < length; i++ ){
            if(str.charAt(i)==ch) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        testText();
    }

    static void testText(){
        Scanner scan = new Scanner( System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();
        System.out.println("Enter the letter you want ot count: ");

        char ch = scan.next().charAt(0);
        int occurrance = Text.countLetter(word, ch);
        System.out.println(String.join(
                word,
                "contains",
                Integer.toString(occurrance).concat(Character.toString(ch))
        ));

    }
}
