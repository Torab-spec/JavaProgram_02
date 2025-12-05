import java.util.Scanner;

public class Challenge68 {
    // 68 --> Fibonacci using recursion
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        for (int i = 1;i<=num; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int pos){
        if (pos ==1){
            return  0;
        }
        if(pos ==2) {
            return 1;
        }
        return fibonacci(pos-1) + fibonacci(pos-2);
    }
}
