public class Challenge90 {
    //
    public static void main(String[] args) {
        System.out.println(concatenate("Md"));
        System.out.println(concatenate("Abu"));
        System.out.println(concatenate("Torab"));
        System.out.println(concatenate("Uddin"));
    }

    public static String concatenate(String... strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }

}
