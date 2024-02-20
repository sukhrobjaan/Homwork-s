package lesson9.example1;

public class Telegram {
    User[] users = new User[1000];
    int count = 0;
    String phone;
    int code;
    User user0;
    int phonecode = 11111;

    public int getPhonecode() {
        return phonecode;
    }

    public void setPhonecode(int phonecode) {
        this.phonecode = phonecode;
    }

    public User getUser0() {
        return user0;
    }

    public void setUser0(User user0) {
        this.user0 = user0;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    boolean createAcount(User user) {
        if (count > 0) {
            for (int i=0;i<count;i++) {
                if (users[i].getUserPhone() == user.getUserPhone()) return false;
            }
        }
        setUser0(user);
        setCode(getPhonecode());
        setPhonecode(getPhonecode()+1);
        setPhone(user.getUserPhone());
        return true;
    }

    void checkSMSCode(int code, String phoneNumber) {
        if (code == getCode() && phoneNumber == getPhone()) {
            users[count++] = getUser0();
            System.out.println("Acount yaratildi");
        } else {
            System.out.println("Error Phone or Code ");
        }
    }

    int getUserAccount() {
        return count;
    }

    boolean deleteAccount(String phoneNumber) {
        for (int i = 0; i < count; i++) {
            if (users[i].getUserPhone() == phoneNumber) {
                for (int j = i; j < count - 1; j++) {
                    users[i] = users[i + 1];
                }
                count--;
                return true;
            }
        }
        return false;
    }

    void showInfo() {
        for (int i = 0; i < count; i++) {
            System.out.println("lastName -> " + users[i].getUserLastName());
            System.out.println("firstName -> " + users[i].getUserFirstName());
            System.out.println("Phone -> " + users[i].getUserPhone());
            System.out.println("Age -> " + users[i].getUserAge());
            System.out.println("-----------------");
        }
    }

}
