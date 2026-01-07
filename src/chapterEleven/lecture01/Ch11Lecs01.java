package chapterEleven.lecture01;

public class Ch11Lecs01 {
    public static void main(String[] args) {
        System.out.println("Passing Zero arguments : " + sum());
        System.out.println("Passing one arguments : " + sum(2));
        System.out.println("Passing two arguments : " + sum(2, 3));
        System.out.println("Passing three arguments : " + sum(2, 3, 4));
        System.out.println(" ");

        System.out.println("Passing two arguments : " + add(2, 3));
        System.out.println("Passing three arguments : " + add(2, 3, 4));

    }

    public static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static int add(int x, int y, int... a) {
        int add = 0;
        for (int i : a) {
            add += i;
        }
        return add;
    }
}
