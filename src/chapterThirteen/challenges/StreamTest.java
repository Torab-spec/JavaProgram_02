package chapterThirteen.challenges;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = List.of("Torab", "Sain", "Bina", "Rina", "Tina");
        names.stream().forEach(name -> System.out.print(name+ " "));
    }
}
