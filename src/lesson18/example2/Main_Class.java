package lesson18.example2;

import java.util.ArrayList;
import java.util.List;

public class Main_Class {

    public static void main(String[] args) {

        List<String> AAA = new ArrayList<>();

        List<String> list1 = new ArrayList<>();
        list1.add("Sanjar");
        list1.add("sohib ");
        list1.add("sabir");
        list1.add("Serob");
        list1.add("Sanjar1");
        list1.add("Sanjar2");
        list1.add("Sanjar3");

        List<String> list2 = new ArrayList<>();

        list2.add("Sanjar1");
        list2.add("Sanjar2");
        list2.add("Sanjar3");
        list2.add("Sanjar4");
        list2.add("Sanjar5");
        list2.add("Sanjar6");
        list2.add("Sanjar7");
        list2.add("Sanjar8");

        list1.removeAll(list2);
        AAA.addAll(list1);

        list2.addAll(list1);

        System.out.println(list2);
        System.out.println(AAA);

    }
}
