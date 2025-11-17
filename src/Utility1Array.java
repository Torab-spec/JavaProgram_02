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
        System.out.print("Your array is : ");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println(" ");
        System.out.print("Your array length is : " + (arr.length - 1) + ", and size is : " + arr.length);
    }

}
