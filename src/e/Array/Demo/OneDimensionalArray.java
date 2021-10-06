package e.Array.Demo;

public class OneDimensionalArray {
    public static void main(String[] args) {
//        new OneDimensionalArray m3();
    }

    void m1(){
        //declare array ( happen at compile  time )
        long[] nums;

        //construct-array-objects ( happen at run time )
        nums = new long[10];

        //initialise-array-value
        nums[0] = 100;
        nums[1] = 200;

        // determine if array is an object
        System.out.println( nums instanceof Object); // true
        System.out.println(Object.class.isInstance(nums)); //true
    }

    void m2(){
        //shorthand to define an array
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // this construct array object and initialised with values with {}
    }

    /*
    * MUST KNOW EXCEPTION when working with Java arrays
    *   ArrayIndexOutOfBoundsException - runtime exception
    * */
    void m3(){
        //array object
        long[] $longs = new long[5];

        //length
        int length = $longs.length; // 5 (index 0 to 4)

        // long element5 = (int)$longs[5]; // we can do explicit down casting to convert long into integer. But possible lost precision.
        long element5 = $longs[5]; // ArrayIndexOutOfBoundsException - runtime exception might COME. INVALID INDEX number as the largest index should be 4

    }
}
