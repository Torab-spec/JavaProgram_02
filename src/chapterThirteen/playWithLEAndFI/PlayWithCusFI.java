package chapterThirteen.playWithLEAndFI;

@FunctionalInterface
interface Sum {
    int add(int a, int b);
}

@FunctionalInterface
interface Greeting {
    void greeting(String greet);
}


public class PlayWithCusFI {
    public static void main(String[] args) {


        Sum sum = (a, b) -> a + b;
        System.out.println(sum.add(10, 20));

        String greet = "Morning Sir";
        Greeting greets = g -> System.out.println(g);
        greets.greeting(greet);


    }
}
