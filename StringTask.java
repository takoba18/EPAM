import java.util.Scanner;

import static java.lang.Math.max;

public class StringTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int maxNumOfWords = new StringTask().solve(input);
        System.out.println(maxNumOfWords);
    }

    private int solve(String input) {
        int maxWords = 0;
        String[] sentences = input.split("[.\\!\\?]");
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            maxWords = max(maxWords, words.length);
        }
        return maxWords;
    }
}
