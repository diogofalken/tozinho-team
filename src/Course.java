public class Course {
    private String name;
    private Integer credits;
    private Integer year;

    public Course(String name, Integer credits, Integer year) {
        this.name = name;
        this.credits = credits;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
