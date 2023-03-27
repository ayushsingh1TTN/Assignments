package org.example;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testTest1() {
        Main obj = new Main();
        assertEquals("Module1",obj.test());
    }
}