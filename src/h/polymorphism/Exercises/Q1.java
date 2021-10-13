package h.polymorphism.Exercises;

import java.time.LocalDate;

public class Q1 {
    //APP HERE
    public static void main(String[] args) {
        //testSaving();
        //testCurrent();
        test2AccEquals();

        //exam always come out
        testAccountPolymorphic();
    }

    static void testSaving(){
        //create 1 object for saving and 1 object for current.
        SavingsAccount sa = new SavingsAccount();
        sa.accNum = 123456;
        sa.balance = 1000;
        sa.dateCreated = LocalDate.now();
        sa.interestRate = 0.05;

        System.out.println(sa); // using tostring to print all out
        System.out.println();
        double interest = sa.calInterest();
        System.out.println("Interest         :" + interest);
        sa.addToBalance(interest);
        System.out.println(sa);

        CurrentAccount current = new CurrentAccount();
    }

    static void testCurrent(){
        //create 1 object for saving and 1 object for current.
        CurrentAccount current = new CurrentAccount();

        current.accNum = 123222;
        current.balance = 2000;
        current.dateCreated = LocalDate.now();
        System.out.println(current);


        System.out.println(">>>>> Test Performing transaction [ 6 times ] ");
        current.deposit(10);
        current.deposit(10);
        current.deposit(10);
        current.deposit(10);
        current.deposit(10);
        current.deposit(10);
        System.out.println(current);
    }

    static void test2AccEquals(){
        SavingsAccount savingAcc = new SavingsAccount();
        savingAcc.accNum = 123456;

        CurrentAccount currentAcc = new CurrentAccount();
        currentAcc.accNum = 12223456;
        System.out.println(">>> Account check ");
        System.out.println(savingAcc.equals(currentAcc));
    }

    static void testAccountPolymorphic(){
        //acc is a polymorphic object-reference
        Account acc; // compile time
        acc = new SavingsAccount(); // run time

        if(SavingsAccount.class.isInstance(acc)){
            //explicit-casting
            SavingsAccount savingAcc = (SavingsAccount) acc;

            savingAcc.accNum = 123456;
            savingAcc.balance = 1000;
            savingAcc.dateCreated = LocalDate.now();
//        acc.interestRate = 0.05; // this will have issue because different Acc type
            savingAcc.interestRate = 0.05; // this is ok after down casting.
        }



        acc = new CurrentAccount(); // run time
        //overriding the default implementation-detail of the Account
        acc.deposit(10);
        acc.withdraw(10);
    }
}


class Account{
    public long accNum;
    public double balance;
    public LocalDate dateCreated;

    //method: + deposit(double) : double
    void deposit(double amount){
        this.balance += amount;
    }

    //method: + withdraw(double) : double
    void withdraw(double amount){
        this.balance -= amount;
    }

    @Override
    public String toString(){
        StringBuilder objectText = new StringBuilder();
        objectText.append("\nAccount Number   : " + accNum);
        objectText.append("\nBalance          : " + balance);
        objectText.append("\nDate Created     : " + dateCreated);
        return objectText.toString();
    }

    @Override
    public boolean equals(Object next){
        Account next_acc = (Account)next;
        return next_acc.accNum == this.accNum;
    }
}

class SavingsAccount extends Account{
    /*
    * - if (last day of the month) ? ( calInterest ) : ( return currentBalance )
    * - monthlyInterest = 1.05
    * - newBalance = currentBalance * monthlyInterest
    * */
    public SavingsAccount(){}

    public double interestRate;


    //method: +calInterest
    public double calInterest(){
        return super.balance * interestRate;
    }

    //method: addToBalance
    void addToBalance(double interest){
        // return super.balance += interest; // or can be
        super.deposit(interest);
    }

    @Override
    public String toString(){
        StringBuilder objectText = new StringBuilder(super.toString());
        objectText.append("\nRate             : " + interestRate);
        return objectText.toString();
    }
}

class CurrentAccount extends Account{
    public final int transactionFee = 1;
    public int freeTransaction = 5;
    public int numOfTransaction = 0;

    /*
     * - if( withdraw() || deposit() ) {
     *
     *      if(exceed number of free transaction){
     *          MinusBalanceWithTransactionFee()
     *   }
     *
     * }
     * */
    public CurrentAccount(){}

    private void handleTransaction(){
        numOfTransaction++;
        if (numOfTransaction > freeTransaction){
            super.withdraw(transactionFee);
        }
    }

    //overriding methods: deposit and withdraw
    public void deposit(double amount){
        handleTransaction();
        System.out.println("Current - deposit transaction");
        this.balance += amount;
    }

    public void withdraw(double amount){
        handleTransaction();
        System.out.println("Current - withdraw transaction");
        this.balance -= amount;
    }

    @Override
    public String toString(){
        StringBuilder objectText = new StringBuilder(super.toString());
        objectText.append("\nTransaction Fee        : " + transactionFee);
        objectText.append("\nTransaction Performed  : " + freeTransaction);
        objectText.append("\nFree Transaction       : " + numOfTransaction);
        return objectText.toString();
    }

}
