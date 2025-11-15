public class Challenge39 {
    //Patterns
    public static void main(String[] args) {
        System.out.println("Printing the first pattern");
        rightHalfPyramid();

        System.out.println("Printing the second pattern");
        reverseRightHalfPyramid();

        System.out.println("Printing the third pattern");
        leftHalfPyramid();

    }

    public static void rightHalfPyramid() {
        int i = 1;

        while (i <= 5) {
            int j = 0;
            while (j < i) {
                System.out.print("* ");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }


    public static void reverseRightHalfPyramid() {
        int i = 1;

        while (i <= 5) {
            int j = i;
            while (j <= 5) {
                System.out.print("* ");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }

    public static void leftHalfPyramid() {
        int i = 1;
        while (i <= 5) {
            int j = 0;
            while (j < (5 - i)) {
                System.out.print(" ");
                j++;
            }
            int k = 0;
            while (k < i) {
                System.out.print("*");
                k++;
            }
            i++;
            System.out.println(" ");
        }
    }
}
