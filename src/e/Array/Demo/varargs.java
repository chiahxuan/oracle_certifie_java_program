package e.Array.Demo;

public class varargs {
    /*
    * boilerplate code noticed
    * */

//    int add( int i, int j) {
//       return i + j ;
//    }
//
//    // overloaded-method
//    int add( int i, int j, int k) {
//        return i + j + k;
//    }
//
//    // overloaded-method
//    int add( int i, int j, int k, int l, int m) {
//        return i + j + k + l + m;
//    }

    int add(){
        return 0;
    }

//    int add ( long ...args){
//        System.out.println("long ...args");
//        int sum=0;
//        for (long i : args) {
//            sum += i;
//        }
//    }

    /*
    * Varargs
    * - help us to avoid boilerplate code
    *
    * Lets say
    * - at least 1 input argument followed by any params in an array.
    * */
    int add(int a, int ...args){
        int sum = a;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int r1 = new varargs().add();
        int r2 = new varargs().add(10, 20, 30, 40);
        int r3 = new varargs().add(1);
        int r4 = new varargs().add(1, 2, 3, 4, 5, 6);

    }

}
