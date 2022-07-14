public class Trainee {
    private int score;
    private String name;
    private String surname;

    public Trainee(int score, String name, String surname) {
        this.score = score;
        this.name = name;
        this.surname = surname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
