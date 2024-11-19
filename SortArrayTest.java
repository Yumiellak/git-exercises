public class SortArrayTest {
    public static void main(String[] args) {
        int[] intArray = { 1, 4, 3, 2 };
        SortArray.sortIntegers(intArray);
        System.out.println(Arrays.toString(intArray)); // [1, 4, 3, 2]

        String[] strArray = { "Toffee", "Coffee", "Banoffee" };
        SortArray.sortStrings(strArray);
        System.out.println(Arrays.toString(strArray)); // [Toffee, Coffee, Banoffee]
    }
}