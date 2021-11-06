package ru.mail.docs;

import org.junit.jupiter.api.*;

public class Junit5Examples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("start\n");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("finish\n");
    }

    @Test
    void firstTest() {
        System.out.println("some bla-bla-bla 123\n");
    }

    @Test
    void secondTest() {
        System.out.println("some bla-bla-bla!!!\n");
    }
}
