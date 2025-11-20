public class Challenge46 {
    // Checking the array is palindrome or not

    public static void main(String[] args) {
        int[] arr = Utility1Array.inputArray();

        boolean isPalindrome = isPalindrome(arr);
        if (isPalindrome) {
            System.out.println("The array is Palindrome");
        } else {
            System.out.println("The is not palindrome");
        }
    }

    public static boolean isPalindrome(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Dang ka array bana vai");

        }
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
