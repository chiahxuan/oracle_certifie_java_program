package e.Array.Demo.Exercise;

import java.util.Arrays;

/*
*
Find the sum and average of the my_array object.
    int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
• Copy the following array elements to another.
    "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio",
    "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino",
"Ristretto”
    • Sort the following String array using Arrays class.
    "Java", "Python", "PHP", "C#", "C Programming", "C++"
* */
public class FindSumAndAverage {
    public static void main(String[] args) {
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("The length is: " + my_array.length);
        System.out.println("The sum is: " + sum(my_array));
        System.out.println("The average is: " + average(my_array));
    }
    public static double sum(int[] intArr ){
        double sum = 0;
        for (int number : intArr) {
            sum += number;
        }
        return sum;
    }

    public static double average(int[] intArr){
        return sum(intArr)/intArr.length;
    }

    public static void sort(String[] strArr){
        for (String string : strArr) {
            System.out.println(string);
        }
    }
}
