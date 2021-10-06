package e.Array.Demo.Exercise;

public class exercise3 {
    public static void main(String[] args) {
        m1();
    }

    static void m1(){
        int[] intArr = { 1, 2, 3, 4, 5 };
        double[] dblArr = { .5, 1, 1.5, 2, 2.5 };

        for (int i = 0; i < intArr.length ; i++) {
            dblArr[i] = dblArr[i] * intArr[i];
            System.out.println(intArr[i] + ": " + dblArr[i]);
        }

        /*
            1: 0.5
            2: 2.0
            3: 4.5
            4: 8.0
            5: 12.5
        * */
    }
}
