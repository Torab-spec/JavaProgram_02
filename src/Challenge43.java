
public class Challenge43 {
    // Checking the given is sorted or nor ?

    public static void main(String[] args) {
        System.out.println("Checking the given array is sorted or not");
        int[] arr = Utility1Array.inputArray();

        boolean isSortedInDecOrder = isSortedInDecOrder(arr);
        boolean isSortedInIncOrder = isSortedInIncOrder(arr);

        if (isSortedInDecOrder || isSortedInIncOrder) {
            System.out.println("The array is sorted : ");
        } else {
            System.out.println("The array is not sorted : ");
        }
        Utility1Array.printArray(arr);


    }

    // Checking in increasing order , is the array sort or not
    public static boolean isSortedInDecOrder(int[] arr) {
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

    // Checking in decreasing order , is the array sort or not

    public static boolean isSortedInIncOrder(int[] arr) {
        // An array with 0 or 1 element is always considered sorted.
        if (arr == null || arr.length <= 1) {
            return true;
        }
        int i = 0;
        while (i < (arr.length - 1)) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
            i++;
        }
        return true;
    }


}
