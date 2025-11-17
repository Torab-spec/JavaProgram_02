public class Challenge42 {
    //find Max and Min  element in an array
    public static void main(String[] args) {
        System.out.println("Find Max and Min in an array");
        int[] arr = Utility1Array.inputArray();

        int findMax = findMax(arr);
        System.out.println("Your max element is " + findMax);
//        int findMin = findMin(arr);
//        System.out.println("Your min element is " + findMin);
    }

    public static int findMax(int[] arr) {
        int i = 0;
        int max = arr[i];
        while (i < (arr.length - 1)) {
            if (arr[i] > arr[i + 1]) {
                max = arr[i];
            }
            i++;
        }

        return max;
    }

    public static int findMin(int[] arr) {

        return 0;
    }

}
