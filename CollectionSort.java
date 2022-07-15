import java.util.*;

public class CollectionSort {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Polymorphism");
        myList.add("Polymorhipsm");
        myList.add("Abstraction");
        myList.add("Inheritance");
        myList.add("Encapsulation");
        Collections.sort(myList, Collections.reverseOrder());
        for (String s : myList) {
            System.out.println(s);
        }
    }
}
