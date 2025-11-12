public class Ch05Lec05 {
    //lec:43 --> Parameter v/s Argument
    public static void main(String[] args) {
        int sum1 = sumTwoNumbers(2, 6);
        System.out.println("The result is : " + sum1);

        int sum2 = sumTwoNumbers(9, 6);
        System.out.println("The result is : " + sum2);
        int sum3 = sumTwoNumbers(56, 14);
        System.out.println("The result is : " + sum3);
        int sum4 = sumTwoNumbers(65, 35);
        System.out.println("The result is : " + sum4);


    }

    public static int sumTwoNumbers(int fNumbers, int sNumbers) {
        System.out.println("The first number is : " + fNumbers);
        System.out.println("The second number is : " + sNumbers);
        int sum = fNumbers + sNumbers;
        return sum;
    }
}
