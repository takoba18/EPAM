import java.util.Date;

public class PersonalInfo {
    private String name;
    private String username;
    private String mail;
    private Date birthDate;

    public PersonalInfo() {
    }

    public PersonalInfo(String name, String username, String mail, Date birthDate) {
        this.name = name;
        this.username = username;
        this.mail = mail;
        this.birthDate = birthDate;
    }

    public PersonalInfo(String name, String username, String mail) {
        this.name = name;
        this.username = username;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
