package eu.attempto.simplejavaapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.URL;
import java.util.List;
import static org.junit.Assert.*;

public class LinkFinderTest {
    URL url;
    @Before
    public void setUp() throws Exception {
        url =this.getClass().getClassLoader().getResource("fbcontent.html");
    }

    @After
    public void tearDown() throws Exception {
        url = null;
    }

    @Test
    public void getLinks() {
        List<String> links;
        links = LinkFinder.getLinks(url.toString());
        assertTrue("There are no links", links.size() > 0);
    }
}
