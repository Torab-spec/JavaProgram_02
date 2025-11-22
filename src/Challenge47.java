public class Challenge47 {
    // Merge Sorted Array
    public static void main(String[] args) {
        System.out.println("Enter your first array ");
        int[] arr1 = Utility1Array.inputArray();
        System.out.println("Enter you second array ");
        int[] arr2 = Utility1Array.inputArray();

        int[] mergeArray = mergeArray(arr1, arr2);
        System.out.print("Here the merger array : ");
        Utility1Array.printArray(mergeArray);


    }

    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int mALen = arr1.length + arr2.length;
        int[] mergerArray = new int[mALen];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length || j < arr2.length) {


            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
                mergerArray[k] = arr1[i];
                i++;
                k++;
            } else {
                mergerArray[k] = arr2[j];
                j++;
                k++;
            }
        }


        return mergerArray;
    }

}
