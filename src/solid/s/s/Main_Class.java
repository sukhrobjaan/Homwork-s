package solid.s.s;

public class Main_Class {
    public static void main(String[] args) {

        Faculty faculty = new Faculty("MathFac");
        Teacher teacher = new Teacher("head teacher", "Sanjar", 28);


        Student student = new Student("2 kurs", "Sukhrob", 23, "IAT","MathFac");
        Student student2 = new Student("2 kurs", "Karim", 22, "IAT","MathFac");
        Student student3 = new Student("2 kurs", "Jobir", 23,"IAT", "MathFac");
        Student student4 = new Student("2 kurs", "Sobir", 22,"IAT", "MathFac");
        Student student5 = new Student("2 kurs", "Ulug'bek", 27, "IAT","MathFac");
        Student student6 = new Student("2 kurs", "Abdullo", 21, "IAT","MathFac");
        Student student7 = new Student("2 kurs", "Malik", 25, "IAT","MathFac");
        Student student8 = new Student("2 kurs", "sherzod", 26, "IAT","MathFac");

        University university = new University();

        university.addStudent(student);
        university.addStudent(student2);
        university.addStudent(student3);
        university.addStudent(student4);
        university.addStudent(student5);
        university.addStudent(student6);
        university.addStudent(student7);
        university.addStudent(student8);


         university.ShowInfo();



    }

}
