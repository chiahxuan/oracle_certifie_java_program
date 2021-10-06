package e.Array.Demo.Exercise;

import java.util.Arrays;

/*
*
• Sort the following String array using Arrays class.
    "Java", "Python", "PHP", "C#", "C Programming", "C++"
*
* */
public class SorterExercise {
    public static void main(String[] args) {
        String[] arr = { "Java", "Python", "PHP", "C#", "C Programming", "C++"};
        String[] sorted_arr = run(arr);

        for (String element : sorted_arr){
            System.out.print(element + ", ");
        }

    }


    public static String[] run(String[] arr){
        Arrays.sort(arr);
        return arr;
    }
}
