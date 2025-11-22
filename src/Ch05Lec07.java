public class Ch05Lec07 {
    // lec45 -- >2d Array
    public static void main(String[] args) {
        int[][] arr1 = new int[2][3];
        arr1[0][0] = 1;

        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
//        System.out.println(arr2[0][0]);

        int i = 0;
        while (i < arr2.length) {
            int j = 0;
            while (j < arr2[i].length) {
                System.out.print(arr2[i][j] + " ");
                j++;
            }
            i++;
        }

    }

}
