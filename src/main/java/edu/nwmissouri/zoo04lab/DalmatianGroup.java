package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 *
 * @author Nikhil Porika
 */
public class DalmatianGroup {

    private static ArrayList<Dalmatian> myGroup;

    /**
     * Create a static group of Dalmatian
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        Dalmatian a = new Dalmatian("python");
        myGroup.add(a);
        myGroup.add(new Dalmatian("venom"));
        myGroup.add(new Dalmatian("Carl"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("*****************************************");
        System.out.println("Hey - look at the Dalmatian!");
        myGroup.forEach(Dalmatian -> {
            Dalmatian.speak();
            Dalmatian.move();
        });
        System.out.println("Nice Dalmatian - that was fun!");
        System.out.println("*****************************************");

    }
}
