package eu.attempto.simplejavaapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkFinder {
    public static ArrayList<String> getLinks(String url) {
        String content = "";
        try {
            content = URLReader.getContent(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<String> links = new ArrayList<String>();

        Pattern patternHref = Pattern.compile("<a\\shref=\"([^\"]+)");
        Matcher matcherHref = patternHref.matcher(content);

        while (matcherHref.find()) {
            String link = matcherHref.group(1);
            if (!link.startsWith("/")) {
                links.add(matcherHref.group(1));
            } else {
                links.add(url + link);
            }
        }
        return links;
    }
}
