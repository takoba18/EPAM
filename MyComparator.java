import java.util.Comparator;

public class MyComparator implements Comparator<String> {

    @Override
    public int compare(String word1, String word2) {
        return word1.substring(1).compareTo(word2.substring(1));
    }
}
