import java.util.Scanner;

public class Challenge64 {
    //64 -> Occurrence in Array of a element
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
        for (int i:arr){
            if (i==num){
                occurrences++;
            }

        }
        return occurrences;
    }
}
