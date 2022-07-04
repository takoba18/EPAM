
public interface Payable() {
    public Money calculatePayment();

    public Money calculateAdditionalPayment();
}
public class Employee {
    private String name;
    private Payable type;

    public Payable getType() {
        return type;
    }

    public void setType(Payable type) {
        this.type = type;
    }
}

public class Salary implements Payable {
    public Money calculatePayment() {
        return 0;
    }

    public Money calculateAdditionalPayment() {
        return 0;
    }
}

public class Commission implements Payable {
    public Money calculatePayment() {
        return 0;
    }

    public Money calculateAdditionalPayment() {
        return 0;
    }
}

public class Hourly implements Payable {
    public Money calculatePayment() {
        return 0;
    }

    public Money calculateAdditionalPayment() {
        return 0;
    }
}

    public Money calculatePay(Employee e) throws InvalidEmployeeType {
        return e.getType().calculatePayment();
    }

    public Money calculateBonus(Employee e) throws InvalidEmployeeType {
        return e.getType().calculateAdditionalPayment();
    }