package eu.attempto.simplejavaapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;

import static org.junit.Assert.*;

public class URLReaderTest {

    URL url;
    @Before
    public void setUp() throws Exception {
        url =this.getClass().getClassLoader().getResource("fbcontent.html");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getContent() {
        String content = "";
        try {
            content = URLReader.getInstance().getContent(url.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue("Couldn't load HTML", content.length() > 0);
    }
}