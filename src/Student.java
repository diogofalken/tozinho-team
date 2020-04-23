import java.util.ArrayList;

public class Student extends Person {
    private String _name;
    private Integer _age;
    private Integer _studyYear;
    private String _email;
    public ArrayList<Course> _courses = new ArrayList<Course>();

    public Student(String name, Integer age, String email, Integer studyYear) {
        this._name = name;
        this._age = age;
        this._email = email;
        this._studyYear = studyYear;
    }

    public String getName() {
        return _name;
    }

    public Integer getAge() {
        return _age;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void addCourse(Course course) {
        this._courses.add(course);
    }

    public void printCourses() {
        _courses.forEach(course -> System.out.println(course.getName()));
    }

    public String getNameAndAge() {
        return this._name.concat(Integer.toString(this._age));
    }
}
