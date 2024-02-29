package lesson16.example4;

public class Student {
    private String lastName;
    private String firstName;
    private int age;
    private int course;

    public Student(String lastName, String firstName, int age, int course) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.course = course;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    void showInfo(){
        System.out.println("Fruit Name -> " + getLastName());
        System.out.println("Fruit Color -> " + getFirstName());
        System.out.println("Fruit Weight -> " + getAge());
        System.out.println("Fruit Weight -> " + getCourse());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }


}
