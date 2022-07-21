import java.util.*;

public class Constants {
    public static final List<String> TOPICS = new ArrayList<>() {{
        add("ClassLoader");
        add("Interface");
        add("Class");
        add("Constants");
        add("OOP");
    }};
    public static final Map<String, String> TRAINEES = new HashMap<>() {{
        put("Tamuna", "Classloader");
        put("Tornike", "String");
        put("Boris", "Class");
    }};

    public static void main(String[] args) {
        TOPICS.add("SOLID");
        TRAINEES.remove("Tamuna");
        TRAINEES.put("TAMAR", "OOP");
        TOPICS.remove("Constants");
        for (String s : TOPICS) {
            System.out.println(s);
        }
        for (String key : TRAINEES.keySet()) {
            System.out.println(key + " " + TRAINEES.get(key));
        }
    }
}
