package d.Operators.Exercise.Exercise1;

import java.util.*;

public class YesNoProgram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter yes or no for the program execution(yes/no): ");
        String input = sc.nextLine();

        do {
            if(input.equals("yes")){
                System.out.println("You decided to continue program execution");
            }else{
                System.out.println("Your input is not yes or no, could reenter your input?");
            }
            System.out.print("Enter yes or no for the program execution(yes/no): ");
            input = sc.nextLine();

        }while(!input.equals("no"));

        System.out.println("You decided to end program. Have fun!");

    }
}
