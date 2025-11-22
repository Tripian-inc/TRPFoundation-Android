package com.tripian.trpfoundationkit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BaseUrlCreatorTest {

    private BaseUrlCreator SUT;
    private String baseUrl = "https://api-link.amazonaws.com/";
    private String basePath = "v2/";

    @Before
    public void setUp() throws Exception {
        SUT = new BaseUrlCreator(baseUrl, basePath);
    }

    @Test
    public void test_getUrl_RightLink() {

        String beforeLink = baseUrl + "/" + basePath;
        String link = SUT.getUrl();

        Assert.assertEquals(link, beforeLink);
    }

    @Test
    public void test_getUrl_WrongLink() {

        String beforeLink = baseUrl + basePath;
        String link = SUT.getUrl();

        Assert.assertNotEquals(link, beforeLink);
    }
}