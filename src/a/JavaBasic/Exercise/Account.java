package a.JavaBasic.Exercise;

public class Account {
    int number;
    double balance;


    void deposit(double amount){

        balance = balance + amount;
        System.out.println("You deposited $" + amount + ", and your current balance is $" + balance);
    }

    void withdraw(double amount){
        balance = balance - amount;
        System.out.println("You withdraw $" + amount +  ", amd your remaining without interest is $" + balance);
        System.out.println("You withdraw $" + amount +  ", amd your remaining with interest is $" + balanceWithInterest(balance));
    }

    double balanceWithInterest(double currentBalance){
        return currentBalance * 1.03;
    }
}

class run{
    public static void main(String[] args) {

        //create account
        Account acc = new Account();
        acc.number = 111223333;
        acc.balance = 10000;

        // deposit 3000
        acc.deposit(3000);

        //withdraw 2500
        acc.withdraw(2500);

    }
}

