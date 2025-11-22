import java.util.Scanner;

public class Utility1Array {
    // inputArray is a method of Utility1Array class
    // Taking array as input
    public static int[] inputArray() {
        System.out.println("Create your array");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of element : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please enter element number " + (i + 1) + " : ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }

    // Iteration of an array
    public static void printArray(int[] arr) {
//        System.out.print("Your array is : ");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println(" ");
//        System.out.println("Your array length is : " + (arr.length - 1) + ", and size is : " + arr.length);
    }

    //input2DArray

    public static int[][] input2DArray() {
        System.out.println("Create your 2D array");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of row : ");
        int row = input.nextInt();
        System.out.print("Please enter the number or column : ");
        int col = input.nextInt();
        int[][] two2DArray = new int[row][col];

        int i = 0;
        while (i < row) {
            int j = 0;
            while (j < col) {
                System.out.print("Enter element for row " + (i + 1) + " column " + (j + 1) + " : ");
                two2DArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return two2DArray;
    }

    // printing 2D array
    public static void print2dArray(int[][] arr) {
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            i++;
        }
        System.out.println(" ");
    }


}
