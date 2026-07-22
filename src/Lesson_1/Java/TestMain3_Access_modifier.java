package Lesson_1.Java;

import org.junit.Test;

public class TestMain3_Access_modifier {

    public String hi = "Hi";
    private String bro = "Bro";

    @Test
    public void printTest () {
        String hello = "Hello!";
        String world = "hello!";
        world = "world";
        hello = "Hello !!!!";

        System.out.println(hello + " " + world);


    }
}

/*
public - виден всем классам в проекте;
private - виден только внутри своего класса;
protected/default - промежуточные уровни доступа;
 */