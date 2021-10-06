package e.Array.Demo.Exercise;

    /*
    * Exercise - Trace the output
    * */


    public class exercise1 {
        public static void main(String[] args) {
            m1();
        }

        static void m1(){
            String[] strArr = new String[10];
            for (int i = strArr.length -1 ; i >= 0; i--) {
                strArr[i] = "b" + (i-1);
            }
            System.out.println("Value: " + strArr[5]); //b4
        }

    }
