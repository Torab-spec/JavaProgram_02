import java.util.Scanner;

public class Challenge41 {
    //Finding number of occurrences
    public static void main(String[] args) {
        int[] arr = Utility1Array.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you number : ");
        int num = input.nextInt();
        int occurrences = CheckOccurrences(arr, num);
        System.out.println("Occurrences of your array is : " + occurrences);
    }

    public static int CheckOccurrences(int[] arr, int num) {

        int occurrences = 0;
        int i = 0;
        while (i < arr.length) {

            if (arr[i] == num) {
                occurrences++;
            }
            i++;
        }
        return occurrences;
    }
}
