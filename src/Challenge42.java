public class Challenge42 {
    //find Max and Min  element in an array
    public static void main(String[] args) {
        System.out.println("Find Max and Min in an array");
        int[] arr = Utility1Array.inputArray();

        int findMax = findMax(arr);
        System.out.println("Your max element is " + findMax);
        int findMin = findMin(arr);
        System.out.println("Your min element is " + findMin);
        System.out.println(" ");
        System.out.println("Finding max and min using MAX_VALUE and MIN_VALUE");
        int max = max(arr);
        System.out.println("Your max element " + max);
        int min = min(arr);
        System.out.println("Your min element " + min);
    }


    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;  // If The array length 0
        }

        int i = 1;
        int max = arr[0];

        while (i < arr.length) {
            if (max < arr[i]) {
                max = arr[i];
            }
            i++;
        }

        return max;

    }

    public static int findMin(int[] arr) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE; // If The array length 0
        }
        int i = 1;
        int min = arr[0];

        while (i < arr.length) {
            if (min > arr[i]) {
                min = arr[i];
            }
            i++;
        }

        return min;
    }


    // Using MAX_VALUE AND MIN_VALUE method of integer class

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        while (i < arr.length) {
            if (max < arr[i]) {
                max = arr[i];
            }
            i++;
        }
        return max;
    }


    public static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < arr.length) {
            if (min > arr[i]) {
                min = arr[i];
            }
            i++;
        }
        return min;
    }


}
