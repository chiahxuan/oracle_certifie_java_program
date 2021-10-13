package f.ObjectOrientedProgramming.Basic.AnonymousClass;

import java.sql.SQLOutput;

public class AnonymousClass{
    public static void main(String[] args) {
        new AnonymousClass().mary.perform();
        new AnonymousClass().helper.doTask();
    }


    // anonymous class implement unimplemented method.
    Job support = new Job() {
        @Override
        void doTask() {
            System.out.println("My job is support. ");
        }
    };

    Job helper = new Job() {
        @Override
        void doTask() {
            System.out.println("My Job is helper");
        }
    };

    Performer mary = new Performer() {
        @Override
        public void perform() {
            System.out.println("I am Mary and I am a Performer");
        }
    };
}

/*
*
1. With abstract class
2. With Java Interface

* */

//Abstract Class
abstract class Job{
    abstract void doTask();
}

//Java Interface
interface Performer{
    void perform();
}