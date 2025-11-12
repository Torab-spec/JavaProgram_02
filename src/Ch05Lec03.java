public class Ch05Lec03 {
    // lec:41 --> What are Function/method
    public static void greetUser() {
        System.out.println("Greeting sir...");
    }

    public static void firstMethod() {
        int i = 0;
        while (i < 5) {
            int j = 0;
            while (j < 5) {
                System.out.print("* ");
                j++;
            }
            System.out.println(" ");
            i++;
        }

    }

    public static void secondMethod() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");

        }
    }

    public static void thirdMethod() {
        int i = 1;
        while (i <= 5) {
            int j = 0; // must declare this variable in this
            while (j < i) {
                System.out.print("* ");
                j++;
            }

            i++;
            System.out.println(" ");

        }
    }

    public static void main(String[] args) {
        System.out.println("Working with method");
//        greetUser();
//        System.out.println("Method calling completed");
        firstMethod();
        System.out.println(" ");
        secondMethod();
        System.out.println(" ");
        thirdMethod();

    }

}
