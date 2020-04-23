import java.util.ArrayList;

public class Student extends Person {
    private String name;
    private Integer age;
    private Integer studyYear;
    private String email;
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Student(String name, Integer age, String email, Integer studyYear) {
        this.name = name;
        this.age = age;
        this.email = email.split("@")[0].concat("@estgv.ipv.pt");
        this.studyYear = studyYear;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addCourse(Course course) {
        if(course.getYear() == this.studyYear) {
            this.courses.add(course);
        }

    }

    public void printCourses() {
        courses.forEach(course -> System.out.println(course.getName()));
    }

    public String getNameAndAge() {
        return this.name.concat(Integer.toString(this.age));
    }
}
