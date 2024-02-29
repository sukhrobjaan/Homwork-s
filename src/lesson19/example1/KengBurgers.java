package lesson19.example1;

import java.util.ArrayList;
import java.util.List;

public class KengBurgers implements MessageInterface {


    List<HamBurger> hamList = new ArrayList<>();
    HamBurger hamBurger;
    List<HamBurger> hamBurgersOrder = new ArrayList<>();

    boolean add(HamBurger hamBurger) {
        boolean bool;
        if (!hamList.contains(hamBurger)) {
            hamList.add(hamBurger);
            bool = addHamBurger(1);
        } else {
            bool = addHamBurger(2);
        }
        return bool;
    }

    boolean addHamBurger(int a) {
        if (a == 1) return true;
        return false;
    }

    boolean there(HamBurger hamBurger) {
        if (hamList.contains(hamBurger)) {
            return true;
        }
        return false;
    }

    void addOrder(HamBurger hamBurger) {
        if (there(hamBurger)) {
            hamBurgersOrder.add(hamBurger);
        } else {
            showInfo("Burger tugagan");
        }
    }

    void showInfoOrder() {
        for (int i = 0; i < hamBurgersOrder.size(); i++) {
            System.out.println(hamBurgersOrder.indexOf(i));
        }
    }

    int showCost() {
        int S = 0;
        for (int i = 0; i < hamBurgersOrder.size(); i++) {
            S+=hamBurgersOrder.get(i).getCost();
        }
        return S;
    }


    @Override
    public void showInfo(String message) {
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "KengBurgers{" + "hamList=" + hamList + '}';
    }

    void showInfo() {
        toString();
    }

    void showList() {

    }


}
