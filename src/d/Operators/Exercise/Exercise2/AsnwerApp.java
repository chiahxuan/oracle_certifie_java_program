package d.Operators.Exercise.Exercise2;
import java.util.*;

public class AsnwerApp {
    public static void main(String[] args) {
        testInvestmentAmount();
    }
    static void testInvestmentAmount(){
        AnswerInvestmentProgram inv = new AnswerInvestmentProgram();
        String cont = "";
        Scanner sc= new Scanner(System.in);

        do{
            //prompt user for investment details
            System.out.println("Enter investment amout: ");
            double amount = sc.nextDouble();
            System.out.println("Enter Annual Interest Rate: ");
            double rate = sc.nextDouble();
            System.out.println("Enter number of years:");
            int year = sc.nextInt();

            double futureInvestmentValue = inv.compute(amount, rate, year);
            System.out.println("Your future investment value: " + futureInvestmentValue);

            //prompt-user
            System.out.println("Do you want to continue?");
            cont = sc.next();

        }while(cont.equals("yes") || cont.equals("y"));
        System.out.println("\n >>> Program quit!");
    }
}


