public class Ch07Lec05 {
    //for-each loop | p:156
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array printing using for loop ");
        usingFor(arr);
        System.out.println(" ");
        System.out.println("Array printing using for each loop ");
        usingForEach(arr);
    }

    public static void usingFor(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void usingForEach(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
