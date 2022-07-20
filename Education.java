public class Education {
    private String university;
    private String degree;
    private String faculty;
    private int startYear;
    private int graduationYear;

    public Education() {
    }

    public Education(String university, String degree, String faculty, int startYear, int graduationYear) {
        this.university = university;
        this.degree = degree;
        this.faculty = faculty;
        this.startYear = startYear;
        this.graduationYear = graduationYear;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }
}
