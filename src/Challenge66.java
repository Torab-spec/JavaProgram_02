public class Challenge66 {
    //66 -> sum all positive numbers
    public static void main(String[] args) {
        int[] arr = Utility1Array.inputArray();

        System.out.println("The sum of poistive number is :  " + sumOfPositive(arr));


    }

    public static int sumOfPositive(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i < 0) {
                continue;
            }
            sum = sum + i;
        }
        return sum;
    }
}
