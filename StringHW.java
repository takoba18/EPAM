import java.util.Scanner;

import static java.lang.Math.max;


public class StringHW {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(new StringHW().solve(input));
    }

    private int solve(String input) {
        int maxNumWords = 0;
        while (input.length() > 0) {
            int index = input.length();
            int indexOfDot = input.indexOf('.');
            int indexOfQuestion = input.indexOf('?');
            int indexOfExclamation = input.indexOf('!');
            index = myMin(index, indexOfExclamation, indexOfDot, indexOfQuestion);
            int numWords = 0;
            for (int i = 0; i < index; i++) {
                if (input.charAt(i) == ' ') numWords++;
            }
            numWords++;
            maxNumWords = max(numWords, maxNumWords);
            input = input.substring(index + 1);
        }
        return maxNumWords;
    }

    private int myMin(int index, int indexOfExclamation, int indexOfDot, int indexOfQuestion) {
        if (indexOfExclamation != -1 && indexOfExclamation < index) index = indexOfExclamation;
        if (indexOfDot != -1 && indexOfDot < index) index = indexOfDot;
        if (indexOfQuestion != -1 && indexOfQuestion < index) index = indexOfQuestion;
        return index;
    }
}
