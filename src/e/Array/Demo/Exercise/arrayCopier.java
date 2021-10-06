package e.Array.Demo.Exercise;

/*
* • Copy the following array elements to another.
    "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio",
    "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino",
* */
public class arrayCopier {
    public static void main(String[] args) {
        String[] arr1 = {"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio",
                "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino"};

        String[] arr2 = new String[arr1.length];

        printArray(to(arr1, arr2));//or

        printArray(copy(arr1, arr2));
    }

    public static String[] to(String[] arr1, String[] arr2 ){
        arr2 = arr1.clone();
        return arr2;
    }

    public static void printArray(String[] strArr) {
        System.out.print("[ ");
        for (String element : strArr) { //String element : sorted_arr
            System.out.print( element+ ", ");
        }
        System.out.println("]");
    }

    //answer - using arraycopy, this is better as you can control the indication of
    public static String[] copy(String[] src, String[] dest ){
        System.arraycopy(src, 0, dest, 3, 5);
        return dest;
    }
}
