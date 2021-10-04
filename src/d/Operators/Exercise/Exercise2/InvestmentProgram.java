package d.Operators.Exercise.Exercise2;

import d.Operators.Exercise.Exercise2.Product;

import java.util.Scanner;

public class InvestmentProgram {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setID(123456);
        product1.setStartYear(2012);
        product1.setInvestmentAmount(100.0);
        product1.setMonthlyInterestRate(1.05);
        product1.setCurrentYear(2021);

        int numOfYears = product1.getCurrentYear()- product1.getStartYear();
        System.out.println("The future investment value is: " + futureInvestmentVal(product1.getInvestmentAmount(), product1.getMonthlyInterestRate(), numOfYears));

    }

    public static double futureInvestmentVal(double investmentAmount, double monthlyInterestRate, int numberOfYears){
        return investmentAmount * (1 + monthlyInterestRate) * numberOfYears*12;
    }

}
