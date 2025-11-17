
public class Challenge40 {
    // Find the sum and average of an array element
    public static void main(String[] args) {

        int[] arr1 = Utility1Array.inputArray();
        long sumOfArray = sumOfArray(arr1);
        System.out.print("Sum of array is : " + sumOfArray);
        int avg = avg(arr1);
        System.out.print(" Average of array sum is : " + avg);

    }

    public static long sumOfArray(int[] arr) {

        int sum = 0;
        int i = 0;

        while (i < arr.length) {
            sum = sum + arr[i];
            i++;
        }
        return sum;
    }

    public static int avg(int[] arr) {
        long sumOfArray = sumOfArray(arr);
        return (int) sumOfArray / arr.length;

    }

}
