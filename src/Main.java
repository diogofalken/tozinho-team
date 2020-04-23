public class Main {

    public static void main(String[] args) {
        Student oli = new Student("Diogo Oliveira", 23, "edwinptgamer@gmail.com", 1);

        System.out.println(oli.getNameAndAge());
        System.out.println(oli.getEmail());

        Course es1 = new Course("Engenharia de Software", 8, 1);
        Course es2 = new Course("Engenharia de Software", 8, 2);

        oli.addCourse(es1);
        oli.addCourse(es2);

        oli.printCourses();
    }
}
