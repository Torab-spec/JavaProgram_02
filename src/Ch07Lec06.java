public class Ch07Lec06 {
    //Break & Continue
    public static void main(String[] args) {
        System.out.println("Break statement");
        usingBreak();
        System.out.println(" ");
        System.out.println("Continue statment");
        usingContinue();

    }

    public static void usingBreak() {
        for (int i = 1; i < 20; i++) {
            if (i == 10) {
                break;
            }
            System.out.print(i + " ");
        }
    }

    public static void usingContinue() {
        for (int i = 1; i < 20; i++) {
            if (i == 10) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
