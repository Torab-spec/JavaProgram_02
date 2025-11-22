public class Challenge49 {
    // Sum and Avg of 2D array Element;
    public static void main(String[] args) {
        int[][] arr = Utility1Array.input2DArray();

        long sum = sumOf2DArray(arr);
        System.out.println("The sum is : " + sum);
        double avg = avg(arr);
        System.out.println("Avg. is : " + avg);

    }

    public static long sumOf2DArray(int[][] arr) {

        int sum = 0;

        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                sum = sum + arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double avg(int[][] arr) {
        if (arr.length == 0) {
            return 0;
        }
        double size = arr.length * arr[0].length;
        return sumOf2DArray(arr) / size;
    }

}
