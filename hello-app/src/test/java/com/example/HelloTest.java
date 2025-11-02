package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloTest {
    @Test
    public void testMessage() {
        assertEquals("Hello from Jenkins Distributed Pipeline!", Hello.getMessage());
    }
}
