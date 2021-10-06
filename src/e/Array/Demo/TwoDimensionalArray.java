package e.Array.Demo;

public class TwoDimensionalArray {
    public static void main(String[] args) {
//        m1();
        m2();
    }

    static void m1(){
        //2d array

        //declare 2d array
        int[][] arr;

        //construct array
        int row = 5, col = 5;
        arr = new int[row][col];

        //initialize value of
        arr[0][0] = 100;
        arr[0][1] = 200;

        show(arr);

    }

    static void m2(){
        //Jagged array
        int[][] arr = new int[4][]; // jagged array

        //initialize array element
        arr[0] = new int[] {0, 1, 2};
        arr[1] = new int[] {6, 4};
        arr[2] = new int[] {1, 7, 6, 8, 9};
        arr[3] = new int[] {5};

        show(arr);

    }

    static void show ( int[][] arr ){
        for (int i = 0; i < arr.length ; i++) { //outer - controlling the roll
            for (int j = 0; j < arr[i].length; j++) { //inner - controlling the column
                //System.out.print(Object.class.isInstance((arr[i])));

                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
