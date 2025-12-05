public class Challenge63 {
    //63 --> Find max value of an integer array;
    public static void main(String[] args) {
        int[] arr = Utility1Array.inputArray();
        System.out.println("Your max value in array is " + findMax(arr));
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int maxValue : arr) {
            if (maxValue > max) {
                max = maxValue;
            }
        }
        return max;
    }
}
