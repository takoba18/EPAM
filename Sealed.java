abstract sealed class Animal permits Dog {
    protected final String color;

    public Animal(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

sealed class Dog extends Animal permits Puppy {
    private final String breed;

    public Dog(String color, String breed) {
        super(color);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

final class Puppy extends Dog {
    private final int age;

    public Puppy(String color, String breed, int age) {
        super(color, breed);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Sealed {
    public static void main(String[] args) {
        //this is the main method of my class, and I am testing my sealed classes here
        //I created different objects, and I am printing different characteristics of those objects
        Animal dog = new Dog("brown", "husky");
        Animal puppy = new Puppy("white", "husky", 1);
        Puppy puppy1 = new Puppy("grey", "hound", 2);
        System.out.println(puppy1.getColor());
        System.out.println(((Puppy) puppy).getAge());
        System.out.println(((Dog) dog).getBreed());
    }
}

