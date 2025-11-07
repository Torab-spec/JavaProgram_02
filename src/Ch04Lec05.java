public class Ch04Lec05 {
    // Unary Operator
    public static void main(String[] args) {
        // 1. (-)
        int a = 5;
        int b = -5;
        System.out.println(b);
        int c = -b;
        System.out.println(c);

        int x = 5;
        System.out.println(x++); //First Print the original value before increasing
        System.out.println(x); // Print the increased value

        int y = 11;
        System.out.println(--y); // First increase the original value then increase

    }
}
