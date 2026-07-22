package Lesson_1.Java;

import org.junit.Test;

public class TestMain2_types {
    @Test // аннотация - ссылка на кейсы например - через JUnit делается
    public void printTest() {

        boolean quer = true;
        float r = 12.5f;
        double x = 12.5;
        char y = 'c';
        int a = 123;
        int b = 721;

        a = a+10;
        a=b;
        b = b +50;

        System.out.println(a);
        System.out.println(b);
        System.out.println(quer);
    }
}
