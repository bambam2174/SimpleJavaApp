package eu.attempto.simplejavaapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import static eu.attempto.simplejavaapp.LinkFinder.getLinks;

public class Main {
    public static void main(String[] args) {
        System.out.println("Was geht ab?");

        ArrayList<String> links =  LinkFinder.getLinks("https://facebook.com");

        for (int i = 0; i < links.size(); i++) {
            System.out.println(links.get(i));
        }

    }
}