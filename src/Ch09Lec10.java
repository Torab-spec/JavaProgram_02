public class Ch09Lec10 {
    // 9.10 ->  Pass by Value and Pass by Reference
    public static void main(String[] args) {
        System.out.println("Pass by Value");
        int a = 5;
        System.out.println(a);
        a++;
        System.out.println(a);


        System.out.println("Pass by Reference");
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        arr[0] = 5;
        System.out.println(" ");
        System.out.println(arr);

        int[] arr2 = new int[1];

        arr2[0] = 10;
        System.out.println(arr2[0]);
        arr2[0] = 20;
        System.out.println(arr2[0]);
    }
}
