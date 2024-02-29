package lesson16.example6;

public class Unversety {
    private String unverName;
    private String vunverLocation;


    public Unversety(String unverName, String vunverLocation) {
        this.unverName = unverName;
        this.vunverLocation = vunverLocation;
    }

    public String getUnverName() {
        return unverName;
    }

    public String getVunverLocation() {
        return vunverLocation;
    }


    class Student {
        private String firstName;
        private String lastNmae;
        private int aga;
        private int course;

        public Student(String firstName, String lastNmae, int aga, int course) {
            this.firstName = firstName;
            this.lastNmae = lastNmae;
            this.aga = aga;
            this.course = course;
        }

        void showInfo() {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Unvesety Name -> " + getUnverName());
            System.out.println("Unvesety Lacation -> " + getVunverLocation());
            System.out.println("Student FirstName -> " + firstName);
            System.out.println("Student LastName -> " + lastNmae);
            System.out.println("Student Age -> " + aga);
            System.out.println("Student Course -> " + course);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");


        }


    }

}
