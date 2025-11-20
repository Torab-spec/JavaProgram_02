import javax.swing.plaf.multi.MultiToolTipUI;
import java.util.Scanner;

public class Challenge44 {
    //Deleting a specific element and return new array
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array deletion");
        int[] arr = Utility1Array.inputArray();
        System.out.print("Now! Enter the number which you want to delete : ");
        int numToDel = input.nextInt();
        System.out.print("The old array is : ");
        Utility1Array.printArray(arr);

        int[] newArray = newArray(arr, numToDel);
        System.out.print("The new array is : ");
        Utility1Array.printArray(newArray);

    }

    public static int[] newArray(int[] arr, int numToDel) {
        // this method come from  class Ch41;
        int occ = Challenge41.CheckOccurrences(arr, numToDel);
        if (occ == 0) {
            return arr; // If nothing have to delete then return the actual array;
        }
        if (occ == arr.length) {
            System.out.println("Your array is null");
            return new int[]{0};
        }

        int newArrLen = arr.length - occ;

        int[] newArr = new int[newArrLen];

        int i = 0, j = 0;
        while (i < arr.length) {

            if (numToDel != arr[i]) {
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }

}
