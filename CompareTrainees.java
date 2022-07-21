import java.util.Comparator;

public class CompareTrainees implements Comparator<Trainee> {

    @Override
    public int compare(Trainee o1, Trainee o2) {
        if (o1.getScore() > o2.getScore()) return 1;
        else if (o1.getScore() < o2.getScore()) return -1;
        return 0;
    }
}
