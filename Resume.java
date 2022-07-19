public class Resume {
    private PersonalInfo personalInfo;
    private Education education;
    private WorkExperience workExperience;
    private ResumeSearch resumeSearch;

    public Resume() {
    }

    public Resume(PersonalInfo personalInfo, Education education, WorkExperience workExperience) {
        this.personalInfo = personalInfo;
        this.education = education;
        this.workExperience = workExperience;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    public ResumeSearch getResumeSearch() {
        return resumeSearch;
    }

    public void setResumeSearch(ResumeSearch resumeSearch) {
        this.resumeSearch = resumeSearch;
    }

    public void search() {
        this.resumeSearch.search();
    }
}