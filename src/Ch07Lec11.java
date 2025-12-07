import java.util.Arrays;

public class Ch07Lec11 {
    //String class
    public static void main(String[] args) {
        String name = "Torab";
        int marks = 99;
        System.out.println("Hey " + name + " your marks is " + marks);
        System.out.printf("Hey %s your marks is %d ", name, marks);

        int number = 987654321;
        String java = "java";
        System.out.println(" ");
        System.out.printf("%s \n", java);
        System.out.printf("%15s \n", java);
        System.out.printf("%-15s \n", java);
        System.out.printf("%15S \n", java);
        System.out.printf("%+,15d \n", number);
        System.out.printf("%-+,15d \n", number);


    }
}
