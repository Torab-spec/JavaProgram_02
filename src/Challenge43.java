
public class Challenge43 {
    // Checking the given is sorted or nor ?

    public static void main(String[] args) {
        System.out.println("Checking the given array is sorted or not");
        int[] arr = Utility1Array.inputArray();

        boolean isSorted = isSorted(arr);
        System.out.println(isSorted);
        if (isSorted) {
            System.out.println("The array is sorted : ");
        } else {
            System.out.println("The array is not sorted : ");
        }
        Utility1Array.printArray(arr);


    }

    public static boolean isSorted(int[] arr) {
        // An array with 0 or 1 element is always considered sorted.
        if (arr == null || arr.length <= 1) {
            return true;
        }
        int i = 0;
        while (i < (arr.length - 1)) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
            i++;
        }
        return true;
    }


}
