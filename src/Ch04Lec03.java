public class Ch04Lec03 {
    public static void main(String[] args) {
/*
        int  a = 9/3/3;
        System.out.println("A : " + a);

        int b = 9 / 3 * 4;
        System.out.println("B : " + b);

        int c  = 9+3*2-10/2;
        System.out.println("C : " + c);
*/

        int a = (12 - 13 * 2); // the operation execute according presidency
        System.out.println("A : " + a);

        int b = (2 * 13 - 12);  // the operation execute according presidency
        System.out.println("B : " + b);

        int c = (12 * 2 - 12 / 3);// the operation execute according associativity
        System.out.println("C : " + c);

        int d = (12 / 3 - 12 * 2);// the operation execute according associativity
        System.out.println("D : " + d);

        int e = (4*3/3);
        System.out.println(e);


    }
}
