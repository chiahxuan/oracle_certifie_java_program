package e.Array.Demo.Exercise;

public class exercise5 {
    public static void main(String[] args) {
        m1();
    }

    static void m1(){
        int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int i = 1; i <= 9 ; i+=2 ) {
            System.out.print( intArr[i]+ ", " );
        }
        /*
            ArrayIndexOutOfBoundsException
        * */
    }
}
