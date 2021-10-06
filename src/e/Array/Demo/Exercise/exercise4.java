package e.Array.Demo.Exercise;

public class exercise4 {
    public static void main(String[] args) {
        m1();
    }

    static void m1(){
        int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < intArr.length ; i+=3 ) {
            System.out.println("value: " + intArr[i]);
        }

        /*
Value:
        * */
    }
}
