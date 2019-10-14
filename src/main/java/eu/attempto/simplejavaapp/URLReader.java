package eu.attempto.simplejavaapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLReader {
    public static String getContent(String szUrl) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        URL url = new URL(szUrl);
        InputStreamReader reader = new InputStreamReader(url.openStream());
        BufferedReader bufferedReader = new BufferedReader(reader);
        String inputLine;
        while ((inputLine = bufferedReader.readLine()) != null) {
            stringBuilder.append(inputLine);
        }
        return stringBuilder.toString();
    }

}
