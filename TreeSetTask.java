import java.util.TreeSet;

public class TreeSetTask {
    public static void main(String[] args) {
        TreeSet<String> words = new TreeSet<>(new MyComparator());
        words.add("Account");
        words.add("Java");
        words.add("Abstraction");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
