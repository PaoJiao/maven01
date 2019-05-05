package com.example.maven01.model;

import org.junit.*;
import org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testSayHello() {
        Assert.assertEquals("Hey, Word.", new HelloWorld().sayHello());
    }
}

