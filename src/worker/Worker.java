package worker;

public class Worker implements Comparable{
    private String surnameAndInitials;
    private String position;
    private int yearStartWork;

    public Worker() {
    }

    public Worker(String surnameAndInitials, String position, int yearStartWork) {
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

    public int getYearStartWork() {
        return yearStartWork;
    }

    @Override
    public String toString() {
        return  "surnameAndInitials=" + surnameAndInitials +
                ", position=" + position +
                ", yearStartWork=" + yearStartWork;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
