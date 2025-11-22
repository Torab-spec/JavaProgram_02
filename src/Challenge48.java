import java.util.Scanner;

public class Challenge48 {
    // Search in 2D Array
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] two2DArr = Utility1Array.input2DArray();
        System.out.print("Enter the number which you want to search for : ");
        int num = input.nextInt();
        System.out.print("Your 2D array is : ");
        Utility1Array.print2dArray(two2DArr);

        if (searchIn2DArr(two2DArr, num)) {
            System.out.println("Your number is present");
        } else {
            System.out.println("Your number is not present");
        }

    }

    public static boolean searchIn2DArr(int[][] arr, int num) {

        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                if (arr[i][j] == num) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
