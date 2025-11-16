import java.util.Scanner;

public class Ch05Lec06 {
    // lec44 --> What is an Array
    public static void main(String[] args) {
        // Array

        int[] myArr1 = new int[5];
        myArr1[0] = 4;
        System.out.print(myArr1[0]);

        int[] myArr2 = {2, 3, 4};
        int i = 0;
        while (i < myArr2.length) {
            System.out.print(myArr2[i]);
            i++;
        }
        System.out.println(" ");
        // Searching in an Array
        int[] myArr = {2, 5, 7, 4, 6, 8, 9};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = input.nextInt();

        boolean isPresent = searchInaneArray(myArr, num);
        yesNo(isPresent);


    }

    public static boolean searchInaneArray(int[] arr, int num) {

        int i = 0;
        while (i < arr.length) {
            if (arr[i] == num) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static void yesNo(boolean noYes){
        if (noYes) {
            System.out.println("Your number is present in this array");
        } else {
            System.out.println("Your number is not present in this array");
        }
    }

}
