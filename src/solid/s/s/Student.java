package solid.s.s;

public class Student {
    private String degree;
    private String name;
    private String faculty;
    private int age;
    private String direction;

    public Student(String degree, String name, int age, String direction, String faculty) {
        this.degree = degree;
        this.name = name;
        this.age = age;
        this.direction = direction;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" + "degree='" + degree + '\'' + ", name='" + name + '\'' + ", age=" + age + ", direction=" + direction + ", faculty=" + faculty + '}';
    }
}
