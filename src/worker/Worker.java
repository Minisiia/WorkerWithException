package worker;

public class Worker {
    private String surnameAndInitials;
    private String position;
    private String yearStartWork;

    public Worker() {
    }

    public Worker(String surnameAndInitials, String position, String yearStartWork) {
        this.surnameAndInitials = surnameAndInitials;
        this.position = position;
        this.yearStartWork = yearStartWork;
    }

    public String getSurnameAndInitials() {
        return surnameAndInitials;
    }

    public String getPosition() {
        return position;
    }

    public String getYearStartWork() {
        return yearStartWork;
    }
}
