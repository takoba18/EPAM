public class WorkExperience {
    private String company;
    private String technology;
    private int yearsOfExperience;

    public WorkExperience() {
    }

    public WorkExperience(String company, String technology, int yearsOfExperience) {
        this.company = company;
        this.technology = technology;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
