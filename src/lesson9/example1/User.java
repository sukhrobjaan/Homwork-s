package lesson9.example1;

public class User {
    String userLastName;
    String userFirstName;
    public String userPhone;
    int userAge;

    public User(String userLastName, String userFirstName, String userPhone, int userAge) {
        this.userLastName = userLastName;
        this.userFirstName = userFirstName;
        this.userPhone = userPhone;
        this.userAge = userAge;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }


    public String getUserLastName() {
        return userLastName;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public int getUserAge() {
        return userAge;
    }
}
