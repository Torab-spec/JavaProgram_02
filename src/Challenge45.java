public class Challenge45 {
    //Reversing an Array

    public static void main(String[] args) {
        int[] arr = Utility1Array.inputArray();
        System.out.print("Your normal array is : ");
        Utility1Array.printArray(arr);

        reversingArray(arr);
        System.out.print("your reverse array is : ");
        Utility1Array.printArray(arr);


    }

    public static void reversingArray(int[] arr) {
//        int[] binArray = new int[arr.length];
        if (arr.length <= 0) {
            System.out.println("Dang ka array bana vai");
        }
        int i = 0, j = (arr.length - 1);

        while (i < j) {
            int binElm = arr[i];
            arr[i] = arr[j];
            arr[j] = binElm;

            i++;
            j--;
        }


    }
}
