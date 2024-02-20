package solid.s.s;

import java.util.ArrayList;

public class University {
    private ArrayList<Student> listStudent = new ArrayList<>();

    public void addStudent(Student student) {
        listStudent.add(student);
    }
    void ShowInfo(){
        int i=1;
        for (Student student : listStudent) {
            System.out.print(i+")  ");
            System.out.println(student);
            i++;
        }
    }


}
