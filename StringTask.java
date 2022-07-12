import java.util.Scanner;

import static java.lang.Math.max;

public class StringTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int ans = solve(s);
        System.out.println(ans);
    }

    public static int solve(String s) {
        int ans = 0;
        String[] sentences = s.split("[.\\!\\?]");
        for (String s1 : sentences) {
            String[] words = s1.split(" ");
            ans = max(ans, words.length);
        }
        return ans;
    }
}
