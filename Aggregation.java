import java.util.ArrayList;
import java.util.List;


class EPAM {
    public String address;
    private List<Project> projects;

    public EPAM(String address, List<Project> projects) {
        this.address = address;
        this.projects = projects;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> allEmployees = new ArrayList<>();
        for (Project project : projects) {
            allEmployees.addAll(project.getEmployees());
        }
        return allEmployees;
    }
}

class Project {
    public String name;
    public String deadline;
    private List<Employee> employees;

    public Project(String name, String deadline, List<Employee> employees) {
        this.name = name;
        this.deadline = deadline;
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

class Employee {
    public String name;
    public String surname;
    public String personalID;

    public Employee(String name, String surname, String personalID) {
        this.name = name;
        this.surname = surname;
        this.personalID = personalID;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        List<Project> projects = new ArrayList<>();
        Employee e = new Employee("Tamuna", "Kobakhidze-Javakhishvili", "01011088224");
        list.add(e);
        Project project = new Project("Training", "01/07/2022", list);
        projects.add(project);
        EPAM epam = new EPAM("10 kvernadze Str.", projects);
        List<Employee> allEmployees = epam.getAllEmployees();
        System.out.println("Number of all EPAM employees: " + allEmployees.size());
    }
}
