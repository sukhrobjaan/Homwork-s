package uzumBank;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class UzumBankDatabase {

    private final ArrayList<UserData> users = new ArrayList<>();

    Message message = new Message() {
        @Override
        public String message(String message) {
            return message;
        }
    };
    private static UzumBankDatabase instense = null;
    private final Scanner scanner=new Scanner(System.in);
    private UzumBankDatabase() {
    }

    private final Consumer<Sign> signListener=(sign )->{
        switch (sign){
            case IN -> {
                //login
                message.message("Passwordni kiritishingiz kerak!");
                String password=scanner.nextLine();

            }
            case UP -> {
                // registration

            }
        }

    };

    public static UzumBankDatabase getInstance() {
        if (instense == null) {
            instense = new UzumBankDatabase();
        }
        return instense;
    }

    public void checkUser(String phoneNumber) {
        if (!isUsersExist(phoneNumber)) {
        } else {
            message.message("Siz ro'yxatdan o'tgansiz ");
            message.message("Passwordni kiriting ");
            signListener.accept(Sign.IN);
           // message.message(String.valueOf(Sign.IN));
        }
    }

    private boolean isUsersExist(String phoneNumber) {
        for (UserData user : users) {
            return user.getPhoneNumber().equals(phoneNumber);
        }
        return false;
    }

    private void login(String number, String password){
        for (UserData user : users) {
            if(user.getPhoneNumber().equals(number)&& user.getPassword().equals(password)){
                message.message("Siz tizimga kirdingiz ");
            }
            else{
                message.message("Poroliz xato!");
            }
        }

    }
}
