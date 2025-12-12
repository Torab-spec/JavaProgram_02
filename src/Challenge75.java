public class Challenge75 {
    //ch75 ->  Concatenate Array of Words
    public static void main(String[] args) {
        String[] arr = new String[]{"Hey ", "I ", "am ", "Torab ", "and ", "I ", "am ", "learning ", "JAVA ", "from ", "Prasant ", "Sir " + "on ", "YouTube,"
        };

        StringBuilder sb = new StringBuilder();

        for (String str : arr) {
            sb.append(str);
        }
        System.out.println(sb);
    }
}
