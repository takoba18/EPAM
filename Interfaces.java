interface Readable {
    default void read() {
        System.out.println("I read the Book");
    }
}

interface EReadable {
    default void read() {
        System.out.println("I read the EBook");
    }
}

class Student implements Readable, EReadable {

    @Override
    public void read() {
        EReadable.super.read();
    }
}

class Teacher implements Readable, EReadable {

    @Override
    public void read() {
        Readable.super.read();
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();
        teacher.read();
        student.read();
    }
}
