import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTests {

    private static void accept(Course course) {
        if (!course.equals("Engenharia de Software")) {
            return;
        }

        assertEquals("Engenharia de Software", course.getName());
    }

    @Test
    public void getName_IsString() {
        Student student = new Student("OliveiraPTGAMERXXX", 69, "69xXDioguinhoPTGamerZinhoXx69@yahoo.com", 1997);

        assertEquals("OliveiraPTGAMERXXX", student.getName());
        assertEquals("69xXDioguinhoPTGamerZinhoXx69@yahoo.com", student.getEmail());
    }

    @Test
    public void getNameAndAge_IsStringAndInteger() {
        Student student = new Student("OliveiraPTGAMERXXX", 69, "69xXDioguinhoPTGamerZinhoXx69@yahoo.com", 1997);
        assertEquals("OliveiraPTGAMERXXX69", student.getName() + student.getAge());
    }

    @Test
    public void email_IsString() throws NoSuchFieldException, IllegalAccessException {
        Student student = new Student("OliveiraPTGAMERXXX", 69, "69xXDioguinhoPTGamerZinhoXx69@yahoo.com", 1997);

        Field field = student.getClass().getDeclaredField("_email");

        field.setAccessible(true);

        assertEquals("69xXDioguinhoPTGamerZinhoXx69@yahoo.com", field.get(student));
    }

    @Test
    public void courses_GetAll() {
        Student student = new Student("OliveiraPTGAMERXXX", 69, "69xXDioguinhoPTGamerZinhoXx69@yahoo.com", 1997);
        Course es1 = new Course("Engenharia de Software", 8, 1);

        student.addCourse(es1);

        student._courses.forEach(StudentTests::accept);
    }


    @Test
    public void getAge_FirstNumber() {
        Student student = new Student("OliveiraPTGAMERXXX", 69, "69xXDioguinhoPTGamerZinhoXx69@yahoo.com", 1997);

        //Nitpicker Antipattern
        Integer age = student.getAge();

        assertEquals(69 , age);
    }
}
