import java.util.PriorityQueue;

public class PriorityQueueTask {
    public static void main(String[] args) {
        //creating pq with custom comparator to compare trainees by their scores and printing them in ascending order.
        PriorityQueue<Trainee> trainees = new PriorityQueue<Trainee>(4, new CompareTrainees());
        trainees.add(new Trainee(8, "Tamuna", "Kobakhidze"));
        trainees.add(new Trainee(3, "Tamar", "Javakhishvili"));
        trainees.add(new Trainee(5, "Tamuna", "Kobakhidze-Javakhishvili"));
        trainees.add(new Trainee(1, "sofo", "kj"));

        for (Trainee trainee : trainees) {
            System.out.println(trainee.getName() + " " + trainee.getSurname() + " " + trainee.getScore());
        }
    }
}
