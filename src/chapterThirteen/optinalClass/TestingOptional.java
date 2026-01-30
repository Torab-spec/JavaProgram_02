package chapterThirteen.optinalClass;

import java.util.Optional;

public class TestingOptional {

    public static void main(String[] args) {
        Optional<String> opt1 = Optional.of("Hello");
        System.out.println(opt1.get());
        Optional<String> opt2 = Optional.empty();
        System.out.println(opt2.get());
        Optional<String> opt3 = Optional.ofNullable("Sain");
        System.out.println(opt3.get());
    }
}

