package lesson19.example1;

import java.util.Objects;

public class HamBurger implements Comparable<HamBurger> {
     String rulonTuri;
     int meat;
     int cost;
     int tomatoWight;
     int secretWight;
     int salads;
     int count;

    public HamBurger(String rulonTuri, int meat, int cost, int tomatoWight, int secretWight, int salads, int count) {
        this.rulonTuri = rulonTuri;
        this.meat = meat;
        this.cost = cost;
        this.tomatoWight = tomatoWight;
        this.secretWight = secretWight;
        this.salads = salads;
        this.count = count;
    }

    public HamBurger(String rulonTuri, int meat, int cost, int tomatoWight, int secretWight, int count) {
        this.rulonTuri = rulonTuri;
        this.meat = meat;
        this.cost = cost;
        this.tomatoWight = tomatoWight;
        this.secretWight = secretWight;
        this.count = count;
    }

    public HamBurger(String rulonTuri, int meat, int cost, int tomatoWight, int count) {
        this.rulonTuri = rulonTuri;
        this.meat = meat;
        this.cost = cost;
        this.tomatoWight = tomatoWight;
        this.count = count;
    }

    public HamBurger(String rulonTuri, int meat, int cost, int count) {
        this.rulonTuri = rulonTuri;
        this.meat = meat;
        this.cost = cost;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost += cost;
    }

    public String getRulonTuri() {
        return rulonTuri;
    }

    public int getMeat() {
        return meat;
    }

    public int getTomatoWight() {
        return tomatoWight;
    }

    public int getSecretWight() {
        return secretWight;
    }

    public int getSalads() {
        return salads;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HamBurger hamBurger = (HamBurger) o;
        return meat == hamBurger.meat && cost == hamBurger.cost && tomatoWight == hamBurger.tomatoWight && secretWight == hamBurger.secretWight && salads == hamBurger.salads && count == hamBurger.count && Objects.equals(rulonTuri, hamBurger.rulonTuri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rulonTuri, meat, cost, count);
    }

    @Override
    public int compareTo(HamBurger o) {
        return Integer.valueOf(o.rulonTuri).compareTo(Integer.valueOf(this.rulonTuri));
    }

    @Override
    public String toString() {
        return "HamBurger{" +
                "rulonTuri='" + rulonTuri + '\'' +
                ", meat=" + meat +
                ", cost=" + cost +
                ", tomatoWight=" + tomatoWight +
                ", secretWight=" + secretWight +
                ", salads=" + salads +
                ", count=" + count +
                '}';
    }
}
