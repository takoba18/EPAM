class Human {
    String name;
    String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    class Head {
        String eyes;
        String hair;

        public Head(String eyes, String hair) {
            this.eyes = eyes;
            this.hair = hair;
        }
    }
}

public class Nested {
    public static void main(String[] args) {
        Human human = new Human("tamuna", "Kobakhidze-Javakhishvili");
        Human.Head head = human.new Head("black", "black");
        System.out.println(human.name + head.eyes);
    }
}
