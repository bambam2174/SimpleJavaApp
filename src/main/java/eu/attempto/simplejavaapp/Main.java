package eu.attempto.simplejavaapp;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("Fetching Links");

        if (args.length == 0) {
            System.out.println("Pass URL as parameter");
            return;
        }

        List<String> links =  LinkFinder.getLinks(args[0]);

        for (int i = 0; i < links.size(); i++) {
            System.out.println(links.get(i));
        }
    }
}