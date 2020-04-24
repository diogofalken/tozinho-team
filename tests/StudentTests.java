import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTests {

    @Test
    public void getName_IsString() {
        Student student = new Student("OliveiraPTGAMERXXX", 69, "69xXDioguinhoPTGamerZinhoXx69@yahoo.com", 1997);

        assertEquals("OliveiraPTGAMERXXX", student.getName());

        //Fixed free ride anti pattern UNIT
    }

    @Test
    public void getAge_IsInteger() {
        Student student = new Student("OliveiraPTGAMERXXX", 69, "69xXDioguinhoPTGamerZinhoXx69@yahoo.com", 1997);
        assertEquals(69, student.getAge());

        // Fixed second class citizen anti pattern TDD
    }

    @Test
    public void email_IsString() throws NoSuchFieldException, IllegalAccessException {
        Student student = new Student("OliveiraPTGAMERXXX", 69, "69xXDioguinhoPTGamerZinhoXx69@yahoo.com", 1997);

        assertEquals("69xXDioguinhoPTGamerZinhoXx69@yahoo.com", student.getEmail());

        // Fixed anal probe anti pattern UNIT
    }

    @Test
    public void courses_GetAll() {
        Student student = new Student("OliveiraPTGAMERXXX", 69, "69xXDioguinhoPTGamerZinhoXx69@yahoo.com", 1997);
        Course es1 = new Course("Engenharia de Software", 8, 1);

        student.addCourse(es1);

        student._courses.stream().filter(course ->
        {
            if(course.getName().equals("Engenharia de Software") == false){
                return false;
            }
            assertEquals("Engenharia de Software", course.getName());
            return true;
        });

    }

    @Test
    public void getAge_FirstNumber() {
        Student student = new Student("OliveiraPTGAMERXXX", 69, "69xXDioguinhoPTGamerZinhoXx69@yahoo.com", 1997);

        Integer age = student.getAge();

        assertEquals(69 , age);

        // Fixed nitpicker anti pattern UNIT
    }
}
