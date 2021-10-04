package d.Operators.Exercise.Exercise2;

public class AnswerInvestmentProgram {
    public double compute(double amount, double annualInterestRate, int year){
        double monthlyInterestRate = annualInterestRate / 12;
        double futureInvestmentValue = amount * Math.pow((1+monthlyInterestRate), year*12);
        return futureInvestmentValue;
    }
}
