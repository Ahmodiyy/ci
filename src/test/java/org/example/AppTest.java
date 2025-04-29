package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
    @Test
    void appTest(){
        App app = new App();
        String appName = app.app();
        Assertions.assertEquals("ci", appName);
    }
    void appTests(){
        App app = new App();
        String appName = app.app();
        Assertions.assertEquals("ci", appName);
    }
}
