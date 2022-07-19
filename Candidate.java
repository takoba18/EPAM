public class Candidate {
    private int id;
    private Resume resume;

    public Candidate() {
    }

    public Candidate(int id, Resume resume) {
        this.id = id;
        this.resume = resume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }
}
